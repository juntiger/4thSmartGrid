package javaFestival;
import java.util.*;
public class Q22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		System.out.println(CollatzNumber(number));
		

	}
	public static int CollatzNumber(int input) {
		int count = 0;

		for (int i = 0; i < 500; i++) {
			if(input%2==0) {
				input = input/2;
			}else {
				input = input*3+1;
			}
			
			count++;
			if(input==1) {
				break;
			}

		}
		if (input!=1) {
			count = -1;
		}
		
		return count;
	}

}
