//안주자판기
//[1]닭발(7000원), [2]라면(1500원), [3]오뎅탕(3000원), [4]소맥(5000원)
//1. 메뉴를 띄워준다.
//2. 금액을 입력받는다.
//3. 메뉴 선택
//4. 가진 돈보다 많은 경우 '돈이 부족합니다' 출력.
//5. 잔돈 출력

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String menu = "[1]닭발(7000원), [2]라면(1500원), [3]오뎅탕(3000원), [4]소맥(5000원)";

		System.out.println(menu);

		int price1 = 7000;
		int price2 = 1500;
		int price3 = 3000;
		int price4 = 5000;
		String menuSelect = "";
		int temp=0;

		while(true) {
			System.out.print("금액을 입력하세요: ");
			int money = sc.nextInt()+temp;

			System.out.print("메뉴를 선택하세요: ");
			int select = sc.nextInt();

			switch(select) {
			case 1:
				System.out.println("닭발(7000원) 선택.");
				temp = func(money, price1);		
				menuSelect += "닭발(7000원) ";
				break;
			case 2:
				System.out.println("라면(1500원) 선택.");			
				temp = func(money, price2);
				menuSelect += "라면(1500원) ";
				break;
			case 3: 
				System.out.println("오뎅탕(3000원) 선택");		
				temp = func(money, price3);
				menuSelect += "오뎅탕(3000원) ";
				break;
			case 4:
				System.out.println("소맥(5000원) 선택");	
				temp=func(money, price4);
				menuSelect += "소맥(5000원) ";
				break;
			default:
				System.out.println("없는 메뉴입니다.");


			}
			System.out.println("선택한 메뉴: "+menuSelect);
			if(temp<0) {
				System.out.printf("잔액이 부족합니다. 현재 돈: %d[y]/[n]\n", temp);
				break;
			} else if(temp==0) {
				System.out.println("잔액 0원입니다.");
				break;
			}

			System.out.printf("더 구매하시겠습니까? 현재 돈: %d[y]/[n]\n", temp);
			String answer = sc.next();
			if(answer.equals("n")){
				System.out.println("주문이 완료되었습니다.");
				break;
			}
		}
		sc.close();
	}
	public static int func(int money, int price) {
		if(money<price) {
			if(money>0) {
				System.out.println("잔액이 부족합니다.");
			}else {
				System.out.println("다른 메뉴를 골라주세요.");
			}
		}else {
			money -= price;
			System.out.printf("잔돈: %d\n", money);
		}

		return money;
	}
}