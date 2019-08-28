package test;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 대한민국\n2. 미국\n3. 일본\n4. 중국");
		System.out.print("수도를 알고싶은 나라를 선택하세요 >> ");

		int select = sc.nextInt();
		String msg = "";
		switch(select) {
		case 1:
			msg = "서울";
			break;
		case 2:
			msg = "워싱턴";
			break;
		case 3:
			msg = "동경";
			break;
		case 4:
			msg = "북경";
			break;
		default:
			msg = "잘못입력하셨습니다.";

		}
		System.out.println(msg);



	}

}
