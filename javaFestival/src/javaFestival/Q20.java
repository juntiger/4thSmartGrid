package javaFestival;
import java.util.*;

public class Q20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		reverseStr(userInput);

	}


	public static void reverseStr(String input) {

		String[] kToString = input.split("");
		Arrays.sort(kToString);
		for (int i = 0; i < kToString.length; i++) {
			System.out.println(kToString[i]);
		}

	}

}
