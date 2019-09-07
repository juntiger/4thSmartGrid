package javaFestival;
import java.util.*;
public class Q30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		int input = sc.nextInt();
		
		
		
		System.out.print("대시('-')의 총합 >> ");
		System.out.println(digitalNum(input));
		
		

	}
	public static int digitalNum(int input) {
		String ipt = Integer.toString(input);
		String[] ipt2 = ipt.split("");
		int count = 0;
		//ArrayList<String> arrL = new ArrayList<>();
		for (int i = 0; i < ipt2.length; i++) {
			switch(ipt2[i]) {
			case "0":
				count += 6;
				break;
			case "1":
				count += 2;
				break;
			case "2":
				count += 5;
				break;
			case "3":
				count += 5;
				break;
			case "4":
				count += 4;
				break;
			case "5":
				count += 5;
				break;
			case "6":
				count += 6;
				break;
			case "7":
				count += 3;
				break;
			case "8":
				count += 7;
				break;
			case "9":
				count += 6;
				break;
			}
		}
		
		return count;
	}

}
