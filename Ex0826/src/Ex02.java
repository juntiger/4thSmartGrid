import java.util.*;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==Plus Game==");
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int chance = 5;
		while(chance>0) {
			int randNum1 = random.nextInt(9)+1;
			int randNum2 = random.nextInt(9)+1;
			System.out.print(randNum1+"+"+randNum2+"=");
			int input = sc.nextInt();
			if(randNum1+randNum2==input) {
				System.out.println("Success");
				sc.close();
				break;
			}else {
				System.out.println("Fail...");
				if (chance==1) {
					System.out.println("GAME OVER");
				}
			}
			
			chance--;
			
		}

	}

}
