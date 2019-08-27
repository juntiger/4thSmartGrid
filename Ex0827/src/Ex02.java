import java.util.*;
public class Ex02 {
//로그인이 실패했을 경우에 계속 입력, 로그인이 성공하면 프로그램 종료.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String idInput = "아이디를 입력해주세요: ";
		String pwInput = "비밀번호를 입력해주세요: ";
		String msg = "";

		String savedId = "Hello";
		String savedPw = "1234";

		while(true) {
			System.out.print(idInput);
			String userId = sc.next();
			System.out.print(pwInput);
			String userPw = sc.next();

			if (userId.equals(savedId) && userPw.equals(savedPw)) {
				msg = "SUCCESS";
				break;
			}else if(userId.equals(savedId) && !userPw.equals(savedPw)){
				msg = "ID is correct, but password is wrong";
				
			}else if(!userId.equals(savedId) && userPw.equals(savedPw)) {
				msg = "ID is wrong, but password is correct";
			}else {
				msg = "FAIL to LOGON";
			}
			
			System.out.println(msg);


		}
		System.out.println(msg);

	}
}