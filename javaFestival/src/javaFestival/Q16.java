package javaFestival;

public class Q16 {

	public static void main(String[] args) {

		String[] names = {"Queen", "Tod", "Kim"};
		System.out.println(findKim(names));

	}

	
	public static String findKim(String[] input) {
		int saved = 0;
		for (int i = 0; i < input.length; i++) {
			if(input[i].equals("Kim")) {
				saved = i+1;
			}
		}
		
		String result = "김서방은 " +  saved + "에 있다.";
		return result;
	}



}
