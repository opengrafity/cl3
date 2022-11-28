package dev.grafity.marksmgmt;

class Student{
	String name;
	String fatherName;
	String medium;
	int[] marks;
}

public class OOPSApp {
	public static void main(String[] args) {
		Student[] students = new Student[2];
		students[0]= new Student();
		students[1]= new Student();		
		
		students[0].name="Ravi";
		students[0].fatherName="Krishna";
		students[0].medium="TN";
		students[0].marks = new int[] {98,98,95,96,98,97};

		students[1].name="Ramu";
		students[1].fatherName="Siva";
		students[1].medium="EM";
		students[1].marks = new int[] {98,100,100,96,89,97};

		for(int i=0;i<students.length;i++) {
			if(students[i].name.equals("Ramu")) {
				System.out.println(students[i].fatherName);
				break;
			}
		}
		
		
	}
}
