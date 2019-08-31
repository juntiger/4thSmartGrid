import java.util.Random;
//배열에서 가장 큰 수 출력.
public class Ex03 {

	public static void main(String[] args) {

		int[] arr = new int[5];
		Random random = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10)+1;
			for (int j = 0; j < i; j++) {
				if (arr[i]==arr[j]) {
					i--;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int temp=0;
		//정렬 
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.printf("가장 큰 값은 %d입니다.\n", arr[arr.length-1]);
		System.out.printf("가장 작은 값은 %d입니다.\n", arr[0]);
		
		
		
		
		

	}

}
