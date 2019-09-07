package javaFestival;

import java.util.*;

public class Q38 {

	public static void main(String[] args) {
		
		int[] point = {92, 32, 52, 2, 81, 9, 68}; 
		int dist = 0;
		int temp = 999999;
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < point.length; i++) {
			for (int j = i+1; j < point.length; j++) {
				
				dist = point[i]>point[j]? point[i] - point[j] : point[j] - point[i];
				if(dist<temp) {
					temp = dist;
					a = i;
					b = j;
				}

			}
		}
		
		System.out.println("result = [" + a + ", " + b + "]");

	}

}
