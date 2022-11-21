package dev.grafity.arrays;

public class TopperName {
	public static void main(String[] args) {
		int[] marks = new int[5];
		marks[0] = 15;
		marks[1] = 35;
		marks[2] = 10;
		marks[3] = 75;
		marks[4] = 85;
		
		String[] names = new String[5];
		names[0] = "Ravi";
		names[1] = "Kiran";
		names[2] = "Rajeev";
		names[3] = "Geetha";
		names[4] = "Seetha";
		int maxMarks = marks[0];
		int maxIndex = 0;
		for(int i=1;i<marks.length;i++) {
			if(marks[i] > maxMarks ) {
				maxMarks = marks[i];
				maxIndex = i;
			}
		}
		
		System.out.println(names[maxIndex] + "<--->"+ maxMarks);
	}
}
