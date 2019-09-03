package javaFestival;
import java.util.*;
public class Q13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 1;
		
		System.out.print("n 입력: ");
		int input = sc.nextInt();
		
		for (int i = 0; i < input; i++) {
			number = number + i;
			System.out.print(number + " ");
		}
	}

}
