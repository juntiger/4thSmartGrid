package javaFestival;
import java.util.*;

public class Q23 {
	public static void main(String[] args) {
		int input = 5;
		int[] array = new int[input*input];
		for (int i = 1; i <= input; i++) {
			//홀수.
			if(i%2!=0) {
				for (int j = input*i-(input-1), k = 1; k <= input; j++, k++) {
					System.out.print(j + " ");
				}
			//짝수.
			}else {
				for (int j = i * input, k = 1; k <= input; j--, k++) {
					System.out.print(j + " ");
				}
			}
			System.out.println();

		}
	}

}
