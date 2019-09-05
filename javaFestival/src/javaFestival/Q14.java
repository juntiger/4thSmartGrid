package javaFestival;
import java.util.*;
public class Q14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> arrayList = new ArrayList<>(); 
		String intToString = "";
		System.out.print("소인수분해 할 수를 입력하세요: ");
		int input = sc.nextInt();

		System.out.print(input + " = "); 
		
		while(input!=1) {
			for (int i = 2; i <= input; i++) {
				if(input%i==0) {		
					input = input/i;
					//System.out.print(i);
					
					intToString = Integer.toString(i);
					arrayList.add(intToString);
					arrayList.add(" * ");
					break;
				}
			}
			
		}
		
		for (int i = 0; i < arrayList.size()-1; i++) {
			System.out.print(arrayList.get(i));
		}
		


	}

}
