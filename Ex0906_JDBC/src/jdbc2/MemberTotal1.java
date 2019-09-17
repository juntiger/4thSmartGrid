package jdbc2;
import java.util.*;
import java.sql.*;
public class MemberTotal1 {
//MVC 패턴을 적용해보자.
	
	static Connection conn = null;
	static PreparedStatement psmt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("[1]로그인 [2]회원가입 [3]회원정보수정 [4]회원탈퇴 [5]회원정보보기 [6]종료 ");
			int choice = sc.nextInt();
			if(choice == 1) {
			

				System.out.println("====로그인====");
				System.out.print("아이디: ");
				String id = sc.next();
				System.out.print("비밀번호: ");
				String pw = sc.next();
				
				getConn();

				String sql = "SELECT * FROM member2 WHERE id=? AND pw=?";
				try {
					psmt = conn.prepareStatement(sql);
					psmt.setString(1, id);
					psmt.setString(2, pw);
					rs = psmt.executeQuery();
					if(rs.next()) {
						//데이터가 있다면 rs.next(): true반
						System.out.println("로그인 성공.");
					}else {
						System.out.println("로그인 실패.");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					close();
				}

				
			}else if(choice == 2) {
		
				System.out.print("아이디: ");
				String userId = sc.next();
				System.out.print("비밀번호: ");
				String passWd = sc.next();
				System.out.print("닉네임: ");
				String nName = sc.next();
				getConn();

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
					close();
				}

			
				
			}else if(choice == 3) {
				
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
				
				getConn();
				
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
					close();
				}
				
			}else if(choice == 4) {
				
				System.out.println("=====회원 탈퇴=====");

				System.out.print("아이디: ");
				String userId = sc.next();
				System.out.print("비밀번호: ");
				String userPw = sc.next();
				
				getConn();
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
					close();
				}
				
			}else if(choice == 5) {
				
				getConn();
				String sql = "SELECT * FROM member2";
				
				try {
					psmt = conn.prepareStatement(sql);
					rs = psmt.executeQuery();
					int num = 1;
					System.out.println("번호\t아이디\t비밀번호\t닉네임");
					while(rs.next()) {
						//데이터베이스의 첫번째 칼럼 정보 출력. 여기서는 id
						System.out.println(num++ + "\t" + rs.getString(1) + "\t" + rs.getString("pw") + "\t" + rs.getString(3));
						
					}
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					close();
				}
				
			}else if(choice == 6) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
		}

	}
	
	public static void getConn() {
		
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
	
	public static void close() {

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

}
