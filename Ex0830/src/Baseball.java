import java.util.*;
public class Baseball {

	public static void main(String[] args) {
		Random random  = new Random();
		Scanner sc = new Scanner(System.in);

		int[] com = new int[3];


		for (int i=0; i<com.length;i++) {
			com[i] = random.nextInt(20)+1;
			for (int j=0; j<i;j++) {
				if(com[j]==com[i]) {
					i--;
				}
			}
		}
		System.out.println(com[0]);
		System.out.println(com[1]);
		System.out.println(com[2]);

		int[] user = new int[3];

		boolean isRunning = true;
		while(isRunning) {
			int strike = 0;
			int ball = 0;
			int out = 0;
			System.out.print("첫번 째 숫자: ");
			int user1 = sc.nextInt();
			System.out.print("두번 째 숫자: ");
			int user2 = sc.nextInt();
			System.out.print("세번 째 숫자: ");
			int user3 = sc.nextInt();

			user[0] = user1;
			user[1] = user2;
			user[2] = user3;

			for(int i=0;i<com.length;i++) {
				for(int j=0;j<user.length;j++) {
					if (com[i] == user[j] && i == j) 
					{ 
						strike++; 

					}else if(com[i] == user[j] && i != j) {
						ball++;
					}else {
						out++;
					}
				
				}
			}
			
			if(strike==3) {
				System.out.println("정답.");
				isRunning = false;
			} else if(strike>=1 || ball>=1) {
				System.out.printf("%dstrike, %dball\n",strike,ball);
			} else if(out>0) {
				System.out.println("out");
			}
		}

	}

}
