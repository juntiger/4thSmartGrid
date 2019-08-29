
public class Ex07 {

	public static void main(String[] args) {
		for(int i=1;i<=50;i++) {
			if(i/10==3) {
				if(i-i/10*10==3 || i-i/10*10==6 || i-i/10*10==9) {
					
					System.out.println("짝짝");
				}else {
					System.out.println("박수");
				}
			}else if(i-i/10*10==3 || i-i/10*10==6 || i-i/10*10==9) {
				System.out.println("박수");
			}else {
				System.out.println(i);
			}
			
		}
	}

}
