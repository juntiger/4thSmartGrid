//한 개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력하는 프로그램
import java.util.*;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 입력: ");
		int input = sc.nextInt();
		int result = 0;
		
		System.out.print("배수: ");
		for (int i=1;i<11;i++) {
			result = input * i;
			System.out.print(result + " ");
		}
		
		sc.close();
	}

}
