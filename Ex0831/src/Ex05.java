import java.util.*;
public class Ex05 {

	public static void main(String[] args) {
		
		char[] waterMelon = {'수','박'};
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 수박 게임 Start! ====");
		System.out.print("숫자를 입력해주세요>> ");
		int input = sc.nextInt();
		for (int i = 0; i < input; i++) {
			System.out.print(waterMelon[i%2]);
			
		}
		
	}

}
