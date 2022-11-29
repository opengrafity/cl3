package dev.grafity.marksmgmt;

import java.util.Scanner;

class Student{
	String name;
	String fatherName;
	String medium;
	int[] marks = new int[6];
}

class Subject{
	int id;
	String name;
}

public class OOPSApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students");
		int noOfStudents = Integer.parseInt(sc.nextLine());
		
		Student[] students = new Student[noOfStudents];
		
		Subject[] subjects = new Subject[6];
		subjects[0] = new Subject();
		subjects[0].id=1;
		subjects[0].name="Telugu";
				
		subjects[1] = new Subject();
		subjects[1].id=2;
		subjects[1].name="Hindi";
		
		subjects[2] = new Subject();
		subjects[2].id=3;
		subjects[2].name="English";
		
		subjects[3] = new Subject();
		subjects[3].id=4;
		subjects[3].name="Maths";
		
		subjects[4] = new Subject();
		subjects[4].id=5;
		subjects[4].name="Science";
		
		subjects[5] = new Subject();
		subjects[5].id=6;
		subjects[5].name="Social";

		for(int i=0;i<noOfStudents;i++) {
			System.out.println("Enter name of student-" + (i+1));
			students[i] = new Student();
			students[i].name=sc.nextLine();
			System.out.println("Enter father name of student-" + (i+1));
			students[i].fatherName=sc.nextLine();
			System.out.println("Enter medium of student-" + (i+1));
			students[i].medium=sc.nextLine();
			
			for(int j=0;j<6;j++) {
				System.out.println("Enter marks of "+subjects[j].name);
				students[i].marks[j] = Integer.parseInt(sc.nextLine());
			}			
		}
		
		int choice = 3;
		do {
			
			System.out.println("Enter your choice \n1)Find topper of a subject \n2)Find failed students of a subject 3)Exit");
			choice = Integer.parseInt(sc.nextLine());
			switch(choice){
			case 1:
				System.out.println("Enter subject name");
				String keySubjectName = sc.nextLine();
				
				Subject subject = findSubject(subjects, keySubjectName);
				
				if(subject == null) {
					System.out.println("Entered subject is invalid, enter a valid subject name");
					keySubjectName = sc.nextLine();
					subject = findSubject(subjects, keySubjectName);
					if(subject == null) {
						System.out.println("Subject name is invalid, maximum number of choices exausted");
						return;
					}					
				}
				
				Student topper = null;
				
				for(Student std:students) {
					if(topper == null) {
						topper = std;
					}else {
						if(std.marks[subject.id-1] > topper.marks[subject.id-1]  ) {
							topper = std;
						}
					}
				}
				System.out.println(topper.name);
				
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
	
	public static Subject findSubject(Subject[] subjects, String key) {
		for(Subject sub:subjects) {
			if(sub.name.equalsIgnoreCase(key)) {
				return sub;
			}
		}
		return null;
	}
}
