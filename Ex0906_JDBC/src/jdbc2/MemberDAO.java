package jdbc2;

import java.sql.*;
import java.util.ArrayList;

public class MemberDAO {

	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	public void getConn() {

		String url = "jdbc:oracle:thin:@192.168.0.7:1521:xe";
		String user = "test";
		String password = "test";

		try {
			Class.forName("oracle.jdbc.OracleDriver");

			conn = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void close() {

		try {
			//열려있다면 닫아줌.
			if (rs!=null) {
				rs.close();
			}
			if(psmt!=null) {
				psmt.close();
			}
			if(conn!=null) {
				conn.close();
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean login(String id, String pw) {

		getConn();

		String sql = "SELECT * FROM member2 WHERE id=? AND pw=?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			if(rs.next()) {
				//데이터가 있다면 rs.next(): true반
				//로그인 성공하면 true 리
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		//실패하면 false 리턴.
		return false;
	}

	public int join(String id, String pw, String nickname) {
		getConn();
		String sql = "INSERT INTO member2 VALUES(?,?,?)";
		int cnt = 0;
		try {
			psmt = conn.prepareStatement(sql);
			//(각 물음표의 인덱스, 넣을 값): 개수를 반드시 맞춰줘야함.
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nickname);
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}

	public int changePw(String id, String pw, String changePw) {
		getConn();
		String sql = "UPDATE member2 SET pw=? WHERE id=? AND pw=?";
		int cnt = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, changePw);
			psmt.setString(2, id);
			psmt.setString(3, pw);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;

	}

	public int exit(String id, String pw) {
		getConn();
		int cnt = 0;
		String sql = "DELETE FROM member2 WHERE id=? AND pw=?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			cnt = psmt.executeUpdate();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;

	}

	public ArrayList<MemberVO> printAll() {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		getConn();
		String sql = "SELECT * FROM member2";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			int num = 1;
			
			while(rs.next()) {

				String id = rs.getString(1);
				String pw = rs.getString(2);
				String nickname = rs.getString(3);
				MemberVO vo = new MemberVO(id, pw, nickname);
				list.add(vo);
				//또는 이렇게 쓸 수 있음.
				//list.add(new MemberVO(id, pw, nickname));

			}



		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}

		return list;
	}


}