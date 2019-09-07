package javaFestival;

public class Q11 {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		int countA = 0;
		int countB = 0;
		int countC = 0;
		int countD = 0;
		int countF = 0;
		String[] array = new String[score.length()/2+1];
		//String[] score_split = score.split(",");
		//파싱한 결과를 score_split에 배열로 저장.
		for (int i = 0; i < array.length; i++) {
			array[i] = score.split(",")[i];
		}
		System.out.println(Integer.toBinaryString(10));
		
		for (int i = 0; i < array.length; i++) {
			switch(array[i]) {
			case "A":
				countA++;
				break;
			case "B":
				countB++;
				break;
			case "C":
				countC++;
				break;
			case "D":
				countD++;
				break;
			case "F":
				countF++;
				break;
			}
			
			
		}
		
		System.out.println("A: " + countA + "명");
		System.out.println("B: " + countB + "명");
		System.out.println("C: " + countC + "명");
		System.out.println("D: " + countD + "명");
		System.out.println("F: " + countF + "명");


		
		
	}
}
