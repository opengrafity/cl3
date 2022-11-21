package dev.grafity.arrays;

import java.util.Scanner;

public class TotalMarks {
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
		
		int j=0;
		while(j<5) {
			total = total + marks[j];
			j++;
		}
				
		System.out.println(total);
		System.out.println((total/500.0)*100);
	}
}
