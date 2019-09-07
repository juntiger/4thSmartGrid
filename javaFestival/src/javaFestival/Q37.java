package javaFestival;

import java.util.Scanner;

public class Q37 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int a = 10;
		int count = 1;
		
		int[] k = new int[a];
		for (int i = 0; i < k.length; i++) {
			k[i] = i+1;
		}
		
		for (int i = 0; i < k.length/2; i++) {
			int b = 0;
			for (int j = 0, l=1; j < k.length/2; j++, l = l + i) {
				b = k[j];
				if(k[j]==a) {
					count++;
				}
			}
		}

	}

}
