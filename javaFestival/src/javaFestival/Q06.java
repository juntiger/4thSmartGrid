package javaFestival;

public class Q06 {

	public static void main(String[] args) {
		
		//처음 숫자 77
		int initial = 77;
		
		//누적할 숫자 0
		int sum = 0;
		
		//반복문 계속 0부터 77까지 돌림.
		for (int i = 0; i <= initial; i++) {
			sum = sum+ (initial-i) * (i+1);
	
		}
		//for 문 밖에 누적 변수 sum 출력.
		System.out.println(sum);
	}

}
