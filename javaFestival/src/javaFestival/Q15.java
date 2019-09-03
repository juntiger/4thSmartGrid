package javaFestival;
import java.util.*;
public class Q15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력>> ");
		int input = sc.nextInt();
		int temp = input;
		int sum = 0;
		boolean isRunning = true;

		//배열 길이를 구함.
		while(isRunning) {
			if(temp<=1) {
				isRunning = false;
			}
			temp = temp/2;
			sum++;
			
		}
		int[] array = new int[sum];
		
		for (int i = 0; i < array.length; i++) {
			if(input%2==0) {
				array[i]=0;
			}else {
				array[i]=1;
			}
			input = input/2;
		}
		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}

}
