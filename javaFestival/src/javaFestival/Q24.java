package javaFestival;

import java.util.*;

public class Q24 {

	public static void main(String[] args) {
		
		int[] point = {92,32,52,9,81,2,68};
		int[] pointCopy = point;
		int count = 0;
		int firstSeq = 0;
		int secondSeq = 0;
		int first = point[0];
		int second = point[1];
		
		boolean isRunning = true;
		Arrays.sort(point);
		
		while(isRunning) {
			for (int i = 0; i < pointCopy.length; i++) {
				if(first == pointCopy[i]) {
					firstSeq = i;
					count++;
				}
				if(second == pointCopy[i]) {
					secondSeq = i;
					count++;
				}
			}
			if(count==2) {
				isRunning = false;
			}
		}
		
		System.out.println("result = [" + firstSeq + ", " + secondSeq + "]");
		System.out.println(point);
		System.out.println(pointCopy);
		

	}

}
