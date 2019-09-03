package javaFestival;
import java.util.*;

public class Q10 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] array = new int[8];
		
		//중복 없는 랜덤 숫자 추출.
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100)+1;
			for (int j = 0; j < i; j++) {
				if(array[j]==array[i]) {
					i--;
				}
			}
		}
		
		String savedNum = "";
		for (int i = 0; i < array.length; i++) {
			//값이 잘 생성되었나 확
			//System.out.println(array[i]);
			savedNum = savedNum + array[i]+" ";
		}
		System.out.println("배열에 있는 모든 값: " + savedNum);
		
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < i; j++) {
				if(array[i]<array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
					
				}
			}
		}
		//작은 수부터 큰 수까지 순서대로 정렬.
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
		
		System.out.println("가장 큰 값: " + array[7]);
		System.out.println("가장 작은 값: " + array[0]);
	}

}
