package javaFestival;
import java.util.*;
public class Q09 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 0;
		System.out.println("최대 공약수&최소 공배수 구하기");
		//10,15 입력-> 최대공약수:5, 최소공배수:30 출력.
		
		System.out.print("숫자1입력>> ");
		int input1 = sc.nextInt();
		
		System.out.print("숫자2입력>> ");
		int input2 = sc.nextInt();
		
		//최대공약수: max
		if(input1 >= input2) {
			for (int i = input1; i > 0; i--) {
				if(input2%i==0 && input1%i==0) {
					max = i;
					break;
				}
			}
		}else {
			for (int i = input2; i > 0; i--) {
				if(input2%i==0 && input1%i==0) {
					max = i;
					break;
				}
			}
		}
		
		min = max * (input1/max) * (input2/max);
		
		System.out.println("최대공약수: " + max);
		
		System.out.println("최소공배수: " + min);
		
	}

}
