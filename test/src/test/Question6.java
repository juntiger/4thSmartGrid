package test;
import java.util.*;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("주사위게임!");
		
		int dice = 6;
		String msg = "";
		
		while(true) {
			
			int com = random.nextInt(dice)+1;
			

			
			System.out.println("==========================");
			System.out.print("1~6까지의 숫자를 입력하세요 >> ");
			int user = sc.nextInt();
			System.out.printf("computer : %d\n", com);
			System.out.printf("user : %d\n", user);

			if(com>user) {
				msg = "computer 승리!";
			}else if(com<user) {
				msg = "user 승리!";
			}else {
				msg = "무승부";
			}

			System.out.println(msg);
			
		}

	}

}
