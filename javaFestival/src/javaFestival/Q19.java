package javaFestival;
import java.util.*;
public class Q19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		fibo(user);
		
	}
	
	
	public static void fibo(int input) {
		int result = 0;
		ArrayList<Integer> fibo = new ArrayList<>();
		fibo.add(1);
		
		if(input==1) {
			result = fibo.get(0);
		}else{
			for (int i = 0; i < input; i++) {
				
			}
		}
		
		System.out.println(result);
	}

}
