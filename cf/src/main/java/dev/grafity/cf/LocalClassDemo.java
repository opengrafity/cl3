package dev.grafity.cf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LocalClassDemo {
	
	public static void main(String[] args) {
		
		class MarksComparator implements Comparator<Student>{

			@Override
			public int compare(Student std1, Student std2) {
				return Integer.compare(std1.getTotalMarks(), std2.getTotalMarks());
			}

		};
		
		Comparator<Student> nameCompartor = new Comparator<Student> (){

			@Override
			public int compare(Student std1, Student std2) {
				return std1.getName().compareTo(std2.getName());
			}

		};

		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(1, "Geetha", 580));
		students.add(new Student(3, "Kavitha", 400));
		students.add(new Student(2, "Sujatha", 590));
		students.add(new Student(4, "Prathibha", 595));
		
		Collections.sort(students, new MarksComparator());
		
		System.out.println(students);
		
		Collections.sort(students, nameCompartor);
		
		System.out.println(students);
		
		Collections.sort(students, new MarksComparator());
		
		System.out.println(students);
		
	}
}
