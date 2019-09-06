package javaFestival;

import java.util.*;

public class Q25 {

	public static void main(String[] args) {
		
		int[] point = {92, 32, 52, 9, 81, 2, 68}; 
		int dist = 9999999;
		int mindist = dist;
		int temp = 0;
		
		
		for (int i = 0; i < point.length; i++) {
			for (int j = i+1; j < point.length; j++) {
				if (point[i]>point[j]) {
					dist = point[i] - point[j];
				}else if(point[i]<point[j]) {
					dist = point[j] - point[i];
				}
			}
		}

	}

}
