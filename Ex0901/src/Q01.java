import java.util.*;
public class Q01 {

	public static void main(String[] args) {
		//입력값을 키보드를 통해 받을 수 있게 스캐너타입의 변수 sc 선언.
		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게: ");
		//현재 몸무게를 now 변수를 통해서 입력받고 now 변수에 저장.
		
		int now = sc.nextInt();
		System.out.print("목표몸무게: ");
		//목표 몸무게를 goal 변수를 통해서 입력받고 goal 변수에 저장.
		int goal = sc.nextInt();
		
		//몇주간 반복할지 모르기 때문에 for 문보다는 while 문을 쓴다.
		
		int temp = 0;
		int week = 0;
		while(true) {
			week++;
			System.out.print(week + "주차 감량 몸무게: ");
			//temp 변수에 입력받은 값을 누적시켜서 저장시켜줌.
			temp+=sc.nextInt();
			//현재 몸무게에서 목표 몸무게를 뺀 값이 누적된 값과 비교해서 작거나 같으면 다이어트 성공!
			if(now-goal<=temp) {
				System.out.println(now-temp+"kg 달성!! 축하합니다!");
				break;
			}
		}
		

	}

}
