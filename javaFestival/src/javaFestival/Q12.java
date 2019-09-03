package javaFestival;
import java.util.*;
public class Q12 {

	public static void main(String[] args) {

		Random random = new Random();
		int lotto = 6;
		int[] number = new int[lotto];
		for (int i = 0; i < lotto; i++) {
			number[i] = random.nextInt(45)+1;
			for (int j = 0; j < i; j++) {
				if(number[i]==number[j]) {
					i--;
				}
			}
		}
		
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	}

}
