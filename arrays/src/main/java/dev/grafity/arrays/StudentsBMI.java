package dev.grafity.arrays;

import java.util.Scanner;

public class StudentsBMI {
	public static void main(String[] args) {
		int[][] bmi = new int[5][2];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<bmi.length;i++) {
			System.out.println("Enter person"+(i+1)+"'s height and weight");
			for(int j=0;j<bmi[i].length;j++) {
				bmi[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<bmi.length;i++) {
			
			System.out.println("Person "+(i+1)+"'s height "+bmi[i][0]+" weight "+bmi[i][1]);
			
		}
	}
}
