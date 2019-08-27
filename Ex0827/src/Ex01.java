import java.util.*;
//plus game 난이도 조절.
public class Ex01 {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		//난이도 조절 변
		int max = 99;
		int life = 5;

		System.out.println("=====Plus Game=====");
		while(true) {
			int ranNum1 = random.nextInt(max)+1;
			int ranNum2 = random.nextInt(max)+1;

			System.out.print(ranNum1 + "+" + ranNum2 + "=");
			int input = sc.nextInt();

			if(ranNum1 + ranNum2 == input) {
				System.out.println("Success!");
			}else {
				System.out.println("Fail!");
				life--;
				System.out.printf("YOUR LIFE REMAINS %d TIME(S)\n", life);
				if(life==0) {
					System.out.println("GAME OVER");
					break;
				}
			}

		}
	}

}
