import java.util.*;
public class Ex03 {

	public static void main(String[] args) {

		String[][] Member = {{"밤편지","아이유"}, {"사계","태연"}, {"비", "폴킴"}, {"인사", "멜로망스"}, {"초록빛", "폴킴"}};
		Scanner sc = new Scanner(System.in);

		
		String k = "";
		int count = 0;
		while(true) {
			System.out.print("노래제목 >> ");
			String input = sc.next();
			for (int i = 0; i < Member.length; i++) {
				if(Member[i][0].equals(input)) {
					k = Member[i][0];
					System.out.println(Member[i][1] + "-" + Member[i][0]);
				}
				
			}
			
			if(!k.equals(input)) {
				System.out.println("존재하지 않습니다.");

			}
		}
	}
}
