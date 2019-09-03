
public class Ex01 {

	public static void main(String[] args) {

		int[] array1 = new int[5];
		int[] array2 = new int[5];
		array2[2] = 50;
		System.out.println(array2[2]);
		System.out.println(array1[2]);
		array1=array2;
		System.out.println(array1[2]);
//		for (int i = 0; i < array1.length; i++) {
//			System.out.println(array1[i]);
//			System.out.println(array2[i]);
//			
//			
//		}
	}

}
