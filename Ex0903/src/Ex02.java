//2차원 배열 실
public class Ex02 {

	public static void main(String[] args) {
		

		int[][] student = {{100,90,80}, {80,80,80}, {100,10,80}, {20,20,100}, {10,10,10}};
		
		for (int i = 0; i < student.length; i++) {
			System.out.println("모든 학생의 점수: " + student[i]);
		}
		
		int[] score = new int[5];
		
		for (int i = 0; i < student.length; i++) {
			int sum = 0;
			for (int j = 0; j < student[i].length; j++) {
				sum = sum + student[i][j];
			}
			score[i]=sum/student[i].length;
		}
		
		for (int i = 0; i < student.length; i++) {
			System.out.println(i+ "번째 학생의 평균 점수: " + score[i]);
		}

	}

}
