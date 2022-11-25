package dev.grafity.marksmgmt;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students");
		int noOfStudents = Integer.parseInt(sc.nextLine());
		
		String[] studentNames = new String[noOfStudents];
		String[] subjectNames = new String[] {"Telugu","Hindi","English","Maths","Science","Social"};
		int[][] marks = new int[noOfStudents][6];
		
		for(int i=0;i<noOfStudents;i++) {
			System.out.println("Enter name of student-" + (i+1));
			studentNames[i]=sc.nextLine();
			for(int j=0;j<6;j++) {
				System.out.println("Enter marks of "+subjectNames[j]);
				marks[i][j] = Integer.parseInt(sc.nextLine());
			}
		}
	
		int choice = 3;
		do {
			System.out.println("Enter your choice \n1)Find topper of a subject \n2)Find failed students of a subject 3)Exit");
			choice = Integer.parseInt(sc.nextLine());
			switch(choice){
			case 1:
				System.out.println("Enter subject name");
				String keySubject = sc.nextLine();
				int keySubjectIndex = findInArray(subjectNames, keySubject);
				if(keySubjectIndex == -1) {
					System.out.println("Entered subject is invalid, enter a valid subject name");
					keySubject = sc.nextLine();
					keySubjectIndex = findInArray(subjectNames, keySubject);
					if(keySubjectIndex == -1) {
						System.out.println("Subject name is invalid, maximum number of choices exausted");
						return;
					}					
				}
				int maxMarks = marks[0][keySubjectIndex];
				int maxIndex = 0;
				
				for(int i=1;i<noOfStudents;i++) {
					if(maxMarks < marks[i][keySubjectIndex]) {
						maxMarks = marks[i][keySubjectIndex];
						maxIndex = i;
					}
				}
				
				System.out.println(studentNames[maxIndex]);
				break;
			case 2:
				System.out.println("Feature yet to be developed");
				break;
			case 3:
				System.out.println("Good Bye");
				System.exit(0);
			default:
				System.out.println("Enter a correct choice");							
			}		
		}while(choice!=3);
	}
	
	public static int findInArray(String[] values, String key) {
		for(int i=0;i<values.length;i++) {
			if(values[i].equalsIgnoreCase(key)) {
				return i;
			}
		}
		return -1;
	}
}
