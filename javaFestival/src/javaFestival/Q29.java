package javaFestival;

public class Q29 {

	public static void main(String[] args) {
		
		System.out.println("원본");
		for (int i = 1; i <= 5; i++) {
			for (int j = i*5-4; j <= i*5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
			
		}
		
		System.out.println("180도 회전");
		for (int i = 5; i >= 1; i--) {
			for (int j = i*5; j >= i*5-4; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
