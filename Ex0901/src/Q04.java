import java.util.*;
public class Q04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총금액 입력: ");
		//만약 처음 값을 25600원 입력.
		int temp = 0;
		int input = sc.nextInt();
		// won10000 = 2
		int won10000 = input/10000; //10000원 짜리: 2개 
		temp = input - won10000*10000; // 25600 - 2*10000 = 5600
		int won5000 = temp/5000; //5000원 짜리: 1개 
		temp = temp - won5000*5000; // 5600 - 1*5000 = 600
		int won1000 = temp/1000; //1000원 짜리: 0개
		temp = temp - won1000*1000; //600 - 0*1000 = 600
		int won500 = temp/500; //500원 짜리: 1개
		temp = temp - won500*500; // 600 - 1*500 = 100
		int won100 = temp/100; //100원 짜리: 1개 
		
		System.out.println("잔돈: " + input + "원");
		System.out.println("10000원: " + won10000 + "개");
		System.out.println("5000원: " + won5000 + "개");
		System.out.println("1000원: " + won1000 + "개");
		System.out.println("500원: " + won500 + "개");
		System.out.println("100원: " + won100 + "개");
		

	}

}
