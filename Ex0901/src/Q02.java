import java.util.*;
public class Q02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//시급 5000
		int sal = 5000;
		//기본 1배의 시급 
		int normal = 1;
		//초과 1.5배의 시급 
		double extra = 1.5;
		
		System.out.print("일한시간을 입력하세요: ");
		int input = sc.nextInt();
		//기본 시급.
		if(input<=8) {
			System.out.println("총 임금은 " + input*sal*normal + "입니다.");
			//초과 시급.
		}else {
			System.out.println("총 임금은 " + (8*sal*normal + (int)((input-8)*1.5*sal)) + "입니다.");
		}
		
		
		

	}

}
