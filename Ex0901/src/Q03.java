
public class Q03 {

	public static void main(String[] args) {
		//값을 누적시킬 변수 temp 선언.
		int temp = 0;
		for (int i = 1; i < 101; i++) {
			//짝수면 앞에 -를 붙여줌.
			if (i%2==0) {
				System.out.print(" -" + i);
				temp-=i;
			//홀수면 앞에 공백.
			}else {
				System.out.print(" " + i);
				temp+=i;
			}
			
		}
		//빈공간 출력.
		System.out.println();
		System.out.println("결과: "+ temp);

	}

}
