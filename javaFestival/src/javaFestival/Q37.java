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
		
		for (int i = 1; i < k.length/2; i++) {
			int b = 0;
			for (int j = i; j < k.length/2; j++) {
				b = k[j];
				if(k[j]==a) {
					count++;
				}
			}
		}
		
		//1부터 5까지 합, 1부터 4까지 합, 1부터 3ㅏㄲ지합 출력
		

	}

}
