import java.util.*;
public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] name = {"차현석", "이은비", "임명진", "박원호", "황해도"};
		System.out.print("이름을 입력해주세요: ");
		String input = sc.next();
		String msg = "";

		int i=0;
		boolean isRunning = true;
		while(isRunning) {
			
			if(input.equals(name[i])) {
				msg = name[i]+"님은 " + i + "번 인덱스에 있습니다.";
				isRunning = false;
			}else {
				msg = "없습니다.";
			}
			i++;
			if(i>name.length-1) {
				isRunning = false;
			}
		}
		System.out.println(msg);
	}


}
