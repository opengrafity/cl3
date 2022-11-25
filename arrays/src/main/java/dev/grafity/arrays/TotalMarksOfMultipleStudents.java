package dev.grafity.arrays;

import java.util.Scanner;

public class TotalMarksOfMultipleStudents {
	public static void main(String[] args) {
		int[] marksOfStd1 = new int[5];
		int[] marksOfStd2 = new int[5];
		int[] marksOfStd3 = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of 5 subjects");
		int i=0;
		while(i<5) {
			marksOfStd1[i] = sc.nextInt();
			i++;
		}
		
		int total = 0;
		
		int j=0;
		while(j<5) {
			total = total + marksOfStd1[j];
			j++;
		}
		
		System.out.println(total);
		System.out.println((total/500.0)*100);
		
		i=0;
		while(i<5) {
			marksOfStd2[i] = sc.nextInt();
			i++;
		}
		
		total = 0;
		
		j=0;
		while(j<5) {
			total = total + marksOfStd2[j];
			j++;
		}
		System.out.println(total);
		System.out.println((total/500.0)*100);
		
		i=0;
		while(i<5) {
			marksOfStd3[i] = sc.nextInt();
			i++;
		}
		
		total = 0;
		
		j=0;
		while(j<5) {
			total = total + marksOfStd3[j];
			j++;
		}
				
		System.out.println(total);
		System.out.println((total/500.0)*100);
	}
}
