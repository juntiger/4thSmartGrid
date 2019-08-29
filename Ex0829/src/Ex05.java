import java.util.*;
public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("단 입력: ");
		int var = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.printf("%d*" + i + "=" + var*i+"\n",var);
		}
		
		sc.close();
		
	}

}
