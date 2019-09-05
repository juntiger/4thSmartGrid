package javaFestival;
import java.util.*;

public class Q21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		isHarshad(userInput);

	}
	
	public static void isHarshad(int input) {
		ArrayList<Integer> arrL = new ArrayList<>();

		int sum = 0;
		
		String StrToInt = Integer.toString(input);
		String[] inputToString = StrToInt.split("");
		
		for (int i = 0; i < inputToString.length; i++) {
			int IntToStr = Integer.parseInt(inputToString[i]);
			arrL.add(IntToStr);
		}
		
		for (int i = 0; i < arrL.size(); i++) {
			sum = sum+arrL.get(i);
		}
		
		if(input%sum==0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
