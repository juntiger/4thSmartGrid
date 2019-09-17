package jdbc1;

import java.sql.*;
import java.util.*;

public class MemberInsert {

	public static void main(String[] args) {
		//JDBC = Java DataBase Connectivity
		String url = "jdbc:oracle:thin:@192.168.0.7:1521:xe";
		String user = "test";
		String password = "test";
		Connection conn = null;
		PreparedStatement psmt = null;
		Scanner sc = new Scanner (System.in);
		
	
		String userId = "";

		String passWd = "";
	
		String nName = "";
		


		try {
			//드라이버 로딩.
			Class.forName("oracle.jdbc.OracleDriver");

			conn = DriverManager.getConnection(url, user, password);
			if(conn==null) {
				System.out.println("연결실패");
			}else {
				//next 다음에 nextLine을 쓰고싶다? next-nextLine-nextLineㅡ이 형식으로 써주면 됨.
				System.out.println("연결성공");
				System.out.print("아이디: ");
				userId = sc.nextLine();
				System.out.print("비밀번호: ");
				passWd = sc.nextLine();
				System.out.print("닉네임: ");
				nName = sc.nextLine();
			}

		} catch (ClassNotFoundException | SQLException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		String sql = "INSERT INTO member2 VALUES(?,?,?)";

		
		try {
			psmt = conn.prepareStatement(sql);
			//(각 물음표의 인덱스, 넣을 값): 개수를 반드시 맞춰줘야함.
			psmt.setString(1, userId);
			psmt.setString(2, passWd);
			psmt.setString(3, nName);
			int cnt = psmt.executeUpdate();

			if (cnt>0) {
				System.out.println("회원가입 성공!");
			}else {
				System.out.println("회원가입 실패!");
			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//작은거 먼저 닫고, 큰거 닫는다.
				if(psmt!=null) {
					psmt.close();
				}
				if(conn!=null) {
					conn.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}


}
