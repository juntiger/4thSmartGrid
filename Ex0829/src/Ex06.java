import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("단 입력: ");
		
		int var = sc.nextInt();
		System.out.print("어느 수까지 출력: ");
		
		int fin = sc.nextInt();
		System.out.printf("%d단 \n", var);
		
		for(int i=1; i<fin+1; i++) {
			System.out.printf("%d*" + i + "=" + var*i+"\n",var);
		}
		
		sc.close();
		
	}

}
