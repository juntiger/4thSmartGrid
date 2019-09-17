package jdbc1;
import java.util.*;
import java.sql.*;
public class MemberUpdate2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement psmt = null;
		String url = "jdbc:oracle:thin:@192.168.0.7:1521:xe";
		String user = "test";
		String password = "test";
		
		System.out.println("====회원정보 수정====");
		System.out.println("아이디: ");
		String id = sc.next();
		System.out.println("비밀번호: ");
		String pw = sc.next();
		System.out.println("바꿀 비밀번호: ");
		String changePw = sc.next();
		System.out.println("바꿀 닉네임: ");
		String nickname = sc.next();
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection(url, user, password);
			
			if(conn==null) {
				System.out.println("연결 실패!");
			}else {
				System.out.println("연결 성공!");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String sql = "UPDATE member2 SET pw=?, nickname=? WHERE id=? AND pw=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, changePw);
			psmt.setString(2, nickname);
			psmt.setString(3, id);
			psmt.setString(4, pw);
			
			int cnt = psmt.executeUpdate();
			if(cnt>0) {
				System.out.println("success");
			}else {
				System.out.println("failed");
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
