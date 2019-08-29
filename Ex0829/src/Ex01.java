//for문 기본 
public class Ex01 {

	public static void main(String[] args) {
		/*
		int number=0;
		
		while(number<10) {
			number++;
			System.out.println(number);
		}

		for(int i=0; i<10; i++) {
			System.out.println(i+1);
		}
		
		for(int i=10; i>0; i--) {
			System.out.println(i);
		}
		
		//if문 사용 x
		for(int i=0; i<50; i=i+2) {
			System.out.println(i+1);
		}
		
		//if문 사용 
		for(int i=0; i<50; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
		*/
		int sum = 0;
		for(int i=0; i<101; i=i+2) {
			sum = sum+i;
		}
		System.out.println("1부터 100까지 짝수의 합 >> " + sum);
	}
}
