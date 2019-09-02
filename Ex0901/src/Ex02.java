//로그인 프로그램.
import java.util.*;
public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String msg = "";
		boolean isRunning = true;
		String[] id_array = new String[3];
		String[] pw_array = new String[3];
		int count = 0;
		while(isRunning) {
			System.out.println("1. 회원가입 2. 로그인 3. 종료");
			int input = sc.nextInt();
			if (input==1) {
				System.out.println("===회원가입===");
				System.out.print("id 입력: ");
				String idInput = sc.next();
				id_array[count] = idInput;
				System.out.print("pw 입력: ");
				String pwInput = sc.next();
				pw_array[count] = pwInput;
				System.out.println("가입 성공.");
			}else if(input==2) {
				System.out.println("===로그인===");
			}else if(input==3) {
				System.out.println("프로그램을 종료합니다.");
				isRunning = false;
			}else {
				System.out.println("올바른 값을 다시 입력하세요");
			}
			count++;
			if(count==3) {
				isRunning = false;
			}
		}
		
		
	}

}
