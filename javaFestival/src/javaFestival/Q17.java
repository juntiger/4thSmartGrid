package javaFestival;
import java.util.*;

public class Q17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int input = sc.nextInt();
		
		for (int i = 1; i <= input ; i++) {
			for (int j = i; j <= input*input; j=j+input) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}
