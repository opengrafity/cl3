package dev.grafity.arrays;


public class App {
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
		
		int max = marks[0];
		
		for(int i=1;i<10;i++) {
			if(max<marks[i]) {
				max = marks[i]; 
			}
		}
		
		System.out.println("Max is "+max);
	}
}
