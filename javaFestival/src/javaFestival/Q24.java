package javaFestival;

public class Q24 {

	public static void main(String[] args) {

		
		System.out.println(jumpCase(4));

	}
	public static int factorial(int input) {
		int result = 1;
		for (int i = 1; i <= input; i++) {
			result = result * i;
		}
		return result;
	}
	
	public static int jumpCase(int input) {

		int count = 1;

		for (int a = 1; a <= input/2; a++) {
			
			count += factorial(input-a)/(factorial(a)*factorial(input-2*a));			
		}
		
		return count;
	}

}
