//2차원 배열 실
public class Ex02 {

	public static void main(String[] args) {
		

		
		int[][] student = {{100,90,80}, {80,80,80}, {100,10,80}, {20,20,100}, {10,10,10}};
		
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[i].length; j++) {
				System.out.print(i + "번째 학생의 점수: " + student[i][j] + " ");
			}
			System.out.println();
		}
		//각 학생별 평균 점수.
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
		//과목별 평균 점수.
		
		int[] subject = new int[3];
		
		for (int i = 0; i < subject.length; i++) {
			int sum = 0;
			for (int j = 0; j < student.length; j++) {
				sum = sum + student[j][i];
			}
			subject[i] = sum/student.length;
		}
		for (int i = 0; i < subject.length; i++) {
			System.out.println((i+1)+ "번째 과목 평균 점수: " + subject[i]);
		}
		
		
		
		

	}

}
