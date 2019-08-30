import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		int[] array = new int[20];
	
		//랜덤한 숫자 중복 제거. 중복 되면 그 숫자 랜덤함수 다시돌림. 중복 안나올 때까지 계속 돌림.
		for (int i=0; i<array.length;i++) {
			array[i] = random.nextInt(20)+1;
			for (int j=0; j<i;j++) {
				if(array[j]==array[i]) {
					i--;
				}
			}
		}
		
		//모든 데이터 출력
		for (int i=0; i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("=========");
		//if문 사용.
		for (int i = 0; i < array.length; i++) {
			if (i%2==0) {
				System.out.println(array[i]);
			}
		}
		
		System.out.println("=========");
		//if문 사용x.
		for (int i = 0; i < array.length; i+=2) {
			System.out.println(array[i]);
		}
		
		System.out.println("=========");
		int num = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2==1) {
				System.out.println(array[i]);
				num+=1;
			}
		}
		System.out.println("홀수 개수: " + num);
		
		System.out.println("=========");
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		avg = sum/(double)array.length;
		System.out.println("평균값: " + avg);

	}

}
