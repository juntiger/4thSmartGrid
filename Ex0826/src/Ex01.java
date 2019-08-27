import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int number = random.nextInt(99);
		number += 1;
		
		System.out.print("숫자를 입력해주세요: ");
		
		
		while(true) {
			int user = sc.nextInt();
			if (user<number) {
				System.out.println("up");
			}else if(user>number){
				System.out.println("down");
				
			}else {
				System.out.println("정답!");
				sc.close();
				break;
				
			}
		}
		
		
		
		
		
		
	}

}
