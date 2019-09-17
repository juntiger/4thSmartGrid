package jdbc1;
import java.util.*;
import java.sql.*;
public class MemberUpdate {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement psmt = null;
		String url = "jdbc:oracle:thin:@192.168.0.7:1521:xe";
		String id = "test";
		String pw = "test";
		String userModifiedPw = "";
		String userModifiednName = "";
		
		System.out.println("=====회원정보수정=====");
		System.out.print("아이디: ");
		String userId = sc.next();
		System.out.print("현재 비밀번호: ");
		String userPw = sc.next();
		System.out.println("비밀번호를 변경하시겠습니까?(y/n)");
		String askPw = sc.next();
		if(askPw.equals("y")||askPw.equals("Y")) {
			System.out.print("변경할 비밀번호: ");
			userModifiedPw = sc.next();
		}else {
			System.out.println("종료합니다.");
			System.exit(0);
		}
		
		System.out.println("닉네임을 변경하시겠습니까?(y/n)");
		String asknName = sc.next();
		if(asknName.equals("y")||asknName.equals("Y")) {
			System.out.print("변경할 닉네임: ");
			userModifiednName = sc.next();
		}else {
			System.out.println("종료합니다.");
			System.exit(0);
			
		}
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection(url, id, pw);
			
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
			psmt.setString(1, userModifiedPw);
			psmt.setString(2, userModifiednName);
			psmt.setString(3, userId);
			psmt.setString(4, userPw);
			
			int cnt = psmt.executeUpdate();
			
			if(cnt>0) {
				System.out.println("회원정보가 성공적으로 수정되었습니다.");
			}else {
				System.out.println("회원정보 수정 실패.");
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
