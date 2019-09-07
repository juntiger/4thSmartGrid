package javaFestival;
import java.util.*;
public class Q19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		
		for (int i = 1; i <= user; i++) {
			System.out.print(fibo(i) + " ");
		}
		
		
	}
	
	
	public static long fibo(int n) {
		//피보나치 수열의 n번째 항을 return
		if (n==1||n==2) {
			return 1;
		} else if(n>2) {
			return fibo(n-1) + fibo(n-2);
		}

		return -1;
	}

}
