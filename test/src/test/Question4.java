package test;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=======더치페이 계산기=======");
		System.out.print("금액 : ");
		int money = sc.nextInt();
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		
		double calc = (double)money/people;
		int calc2 = money/people;
		double subtract100 = (calc-calc2)*100;
		int result = (int)subtract100;
		
		System.out.println("한명당 " + calc2 +"."+ result +"원!");
		//System.out.printf("한명당 %.2f원!",calc);

	}

}
