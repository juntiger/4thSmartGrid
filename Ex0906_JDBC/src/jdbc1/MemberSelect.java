package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MemberSelect {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String url = "jdbc:oracle:thin:@192.168.0.7:1521:xe";
		String user = "test";
		String password = "test";

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
		
		String sql = "SELECT * FROM member2";
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			System.out.println("아이디\t비밀번호\t닉네임");
			while(rs.next()) {
				//데이터베이스의 첫번째 칼럼 정보 출력. 여기서는 id
				System.out.println(rs.getString(1) + "\t" + rs.getString("pw") + "\t" + rs.getString(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//열려있다면 닫아줌.
				if(rs!=null) {
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

		sc.close();

	}

}
