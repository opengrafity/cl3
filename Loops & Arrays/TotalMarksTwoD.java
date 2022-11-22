package dev.grafity.arrays;

import java.util.Scanner;

public class TotalMarksTwoD {
	public static void main(String[] args) {
		int[][] marks= new int[3][5];
		/*
		 * marks[0] = new int[5]; marks[1] = new int[3]; marks[2] = new int[6];
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0;i<marks.length;i++ ) {
			System.out.println("Enter marks of 5 subjects of student:"+(i+1));
			for(int j=0;j<marks[i].length;j++) {
				marks[i][j]=sc.nextInt();
			}			
		}
		
		for(int i=0;i<marks.length;i++ ) {
			int total = 0;
			for(int j=0;j<marks[i].length;j++) {
				total = total+marks[i][j];
			}	
			System.out.println("Student "+(i+1)+" marks "+total);
		}
		
	}
}
