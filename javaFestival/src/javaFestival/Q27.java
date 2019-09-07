package javaFestival;

import java.util.Arrays;

public class Q27 {

	public static void main(String[] args) {


		int A[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		int B[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int[] merge = mergeArray(A, B);



	}

	private static int[] mergeArray(int[] A, int[] B) {
		int[] mer = new int[A.length+B.length];

		for (int i = 0; i < A.length; i++) {
			mer[i]=A[i];
		}
		for (int i = A.length; i < mer.length; i++) {
			mer[i] = B[i-A.length];
		}


		Arrays.sort(mer);
		System.out.print("Merge: [");
		for (int i = 0; i < mer.length; i++) {
			System.out.print(mer[i] + " ");
		}
		System.out.print("]");
		return mer;
	}

}
