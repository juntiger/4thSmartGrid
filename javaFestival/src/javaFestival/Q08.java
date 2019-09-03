package javaFestival;
import java.util.*;
public class Q08 {

	public static void main(String[] args) {
		System.out.print("숫자 입력: ");
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		int up = input/10*10;
		//10으로 나눈 나머지가 5보다 크면 올리고 아니면 내림.
		if(input%10>=5) {
			System.out.println("반올림 수: " + (up+10));
		} else {
			System.out.println("반올림 수: " + up);
		}
		
	}
	

}
