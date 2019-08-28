package test;
import java.util.*;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 >> ");
		int input = sc.nextInt();
		int divisor = 10;
		int number = input/divisor;
		int remainer = input%divisor;
		System.out.printf("%d로 나눈 몫: %d\n", divisor, number);
		System.out.printf("%d로 나눈 나머: %d", divisor, remainer);

	}

}
