package javaFestival;

import java.util.*;

public class Q25 {

	public static void main(String[] args) {
		
		int[] point = {92, 32, 52, 2, 81, 9, 68}; 
		int dist = 0;
		int temp = 999999;
		int temp2 = 999999;
		int a = 0;
		int b=0;
		int c=0;
		int d=0;
		
		for (int i = 0; i < point.length; i++) {
			for (int j = i+1; j < point.length; j++) {
				if (point[i]>point[j]) {
					dist = point[i] - point[j];
					if(dist<temp) {
						temp = dist;
						a=i;
						b=j;
					}
				}else if(point[i]<point[j]) {
					dist = point[j] - point[i];
					if(dist<temp2) {
						temp2 = dist;
						c=i;
						d=j;
					}
				}
			}
		}
		if (temp>temp2) {
			System.out.println(c + "," + d);
		}else {
			System.out.println(a + "," + b);
		}

	}

}
