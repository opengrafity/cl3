package dev.grafity.arrays;

import java.util.Arrays;

public class LargestNumber {
	public static void main(String[] args) {
		int[] marks = new int[10];
		marks[0] = 15;
		marks[1] = 35;
		marks[2] = 10;
		marks[3] = 75;
		marks[4] = 85;
		marks[5] = 100;
		marks[6] = 60;
		marks[7] = 45;
		marks[8] = 37;
		marks[9] = 92;
		
		Arrays.sort(marks);
		
		System.out.println(marks[marks.length-3]);
		
	}
}
