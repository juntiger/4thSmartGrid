package test;
import java.util.*;
public class Question6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();


		int dice = 6;
		String msg = "";
		int comWin = 0;
		int userWin = 0;

		while(comWin <5 && userWin <5) {

			int com = random.nextInt(dice)+1;



			System.out.println("==========================");
			System.out.print("1~6까지의 숫자를 입력하세요 >> ");
			int user = sc.nextInt();
			System.out.printf("computer : %d\n", com);
			System.out.printf("user : %d\n", user);

			if(com>user) {
				comWin++;
				msg = "computer 승리!";

			}else if(com<user) {
				userWin++;
				msg = "user 승리!";


			}else {
				msg = "무승부";
			}
			System.out.println(msg);
			System.out.printf("user(%d) : computer(%d)\n", userWin, comWin);

			if(comWin>=5) {
				System.out.println("종료되었습니다.");
			}else if(userWin>=5) {
				System.out.println("종료되었습니다.");
			}

		}

	}

}
