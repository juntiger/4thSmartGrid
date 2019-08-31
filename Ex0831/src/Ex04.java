import java.util.*;
public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[5];
		String output = "";
		int temp = 0;
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d번째 입력>> ", i+1);
			array[i] = sc.nextInt();
			output = output + " " + array[i];
		}
		System.out.printf("입력된 점수: %s\n", output);
		
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1-i; j++) {
				if(array[j]>array[j+1]) {
					temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		System.out.printf("최고점수: %d\n", array[array.length-1]);
		System.out.printf("최저점수: %d\n", array[0]);
	}

}
