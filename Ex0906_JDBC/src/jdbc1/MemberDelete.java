package jdbc1;
import java.sql.*;
import java.util.*;

public class MemberDelete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String url = "jdbc:oracle:thin:@192.168.0.7:1521:xe";
		String user = "test";
		String password = "test";
		Connection conn = null;
		PreparedStatement psmt = null;

		System.out.println("=====회원 탈퇴=====");

		System.out.print("아이디: ");
		String userId = sc.next();
		System.out.print("비밀번호: ");
		String userPw = sc.next();

		//1.드라이버 동적 로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			//데이터베이스에 접근. 드라이버매니저: 커넥션 객체를 리턴.
			conn = DriverManager.getConnection(url, user, password);

			if(conn==null) {
				System.out.println("연결 실패.");
			}else {
				System.out.println("연결 성공.");
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		String sql = "DELETE FROM member2 WHERE id=? AND pw=?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, userId);
			psmt.setString(2, userPw);
			int cnt = psmt.executeUpdate();

			if(cnt>0) {
				System.out.println("회원 탈퇴 성공.");
			}else {
				System.out.println("회원 탈퇴 실패.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {//열려있다면 닫아줌.
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
	}

}
