
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=100;i++) {
			if(i%2==0) {
				System.out.println(-i);
			}else {
				System.out.println(i);
			}
		}
		int sw = 1;
		
		for(int i=1; i<=100;i++,sw*=-1) {
			System.out.println(i*sw);
		}

	}

}
