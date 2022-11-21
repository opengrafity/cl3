package dev.grafity.arrays;

import java.util.Scanner;

public class FailureCount {
	public static void main(String[] args) {
		int[] marks = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of 5 subjects");
		int i=0;
		while(i<5) {
			marks[i] = sc.nextInt();
			i++;
		}
		
		int total = 0;
		// 85,30,98,34,35
		int j=0;
		while(j<5) {
			if(marks[j] < 35 ) {
				total = total+1;
			}
			j++;
		}
				
		System.out.println(total);		
	}
}
