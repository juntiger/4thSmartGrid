package test;
import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int number = sc.nextInt();
		if(number==0) {
			System.out.println("ZERO");
		}else if(number<0){
			System.out.println("minus");
		}else {
			System.out.println("plus");
		}
	}

}
