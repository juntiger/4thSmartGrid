package javaFestival;
import java.util.*;

public class Q18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("글자를 입력해주세요: ");
		String input = sc.next();
		System.out.println(getMiddle(input));
	}
	
	public static String getMiddle(String input) {
		String[] inputToArray = input.split("");
		int arrayLen = inputToArray.length;
		String result = "";
		if (arrayLen%2==0) {
			result = inputToArray[arrayLen/2-1] + inputToArray[arrayLen/2];
		}else {
			result = inputToArray[arrayLen/2];
		}
		return result;
	}

}
