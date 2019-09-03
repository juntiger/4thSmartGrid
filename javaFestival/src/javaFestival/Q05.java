package javaFestival;
import java.util.*;
public class Q05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수: ");
		int input = sc.nextInt();
		//이중 for문 사용. 이해 안되면 직접 손으로 써가며 해보기!
		for (int i = 1; i <= input; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
