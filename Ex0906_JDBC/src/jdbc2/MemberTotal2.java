package jdbc2;
import java.util.*;
import java.sql.*;
public class MemberTotal2 {
	//MVC 패턴을 적용해보자.


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();

		while(true) {
			System.out.println("[1]로그인 [2]회원가입 [3]회원정보수정 [4]회원탈퇴 [5]회원정보보기 [6]종료 ");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("====로그인====");
				System.out.print("아이디: ");
				String id = sc.next();
				System.out.print("비밀번호: ");
				String pw = sc.next();

				boolean check = dao.login(id, pw);
				if(check) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패");
				}
			}else if(choice == 2) {

				System.out.print("아이디: ");
				String userId = sc.next();
				System.out.print("비밀번호: ");
				String passWd = sc.next();
				System.out.print("닉네임: ");
				String nName = sc.next();

				int cnt = dao.join(userId, passWd, nName);
				if (cnt>0) {
					System.out.println("회원가입 성공!");
				}else {
					System.out.println("회원가입 실패!");
				}

			}
			else if(choice == 3) {

				String userModifiedPw = "";
				String userModifiednName = "";

				System.out.println("=====회원정보수정=====");
				System.out.print("아이디: ");
				String userId = sc.next();
				System.out.print("현재 비밀번호: ");
				String userPw = sc.next();
				System.out.println("변경할 비밀번호: ");
				String modifiedPw = sc.next();
				
				int cnt = dao.changePw(modifiedPw, userId, userPw);
				if (cnt>0) {
					System.out.println("회원가입 성공!");
				}else {
					System.out.println("회원가입 실패!");
				}

			}else if(choice == 4) {

				System.out.println("=====회원 탈퇴=====");

				System.out.print("아이디: ");
				String userId = sc.next();
				System.out.print("비밀번호: ");
				String userPw = sc.next();

				int cnt = dao.exit(userId, userPw);
				if(cnt>0) {
					System.out.println("회원 탈퇴 성공.");
				}else {
					System.out.println("회원 탈퇴 실패.");
				}
				

			}else if(choice == 5) {

				ArrayList<MemberVO> list = dao.printAll();
				System.out.println("번호\t아이디\t비밀번호\t닉네임");
				for (int i = 0; i < list.size(); i++) {
					System.out.println((i+1)+"\t"+list.get(i).getId()+"\t"+list.get(i).getPw()+"\t"+list.get(i).getNickName());
				}
			}
			 else if(choice == 6) {
				 System.out.println("프로그램이 종료되었습니다.");
				 break;
			 }

		}

	}



}


