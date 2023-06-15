package dev.grafity.cf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorDemo {
	public static void main(String[] args) {
		Set<Employee> emps = new TreeSet<>(new EmpSalaryComparator());
		
		emps.add(new Employee(2,"Prathap",Double.valueOf(350000)));
		emps.add(new Employee(3,"Praveen",Double.valueOf(450000)));
		emps.add(new Employee(4,"Sunil",Double.valueOf(150000)));
		emps.add(new Employee(1,"Sukumar",Double.valueOf(250000)));
		emps.add(new Employee(6,"Pramodh",Double.valueOf(7500000)));
		emps.add(new Employee(7,"Kumar",Double.valueOf(8500000)));
		emps.add(new Employee(5,"Dharma",Double.valueOf(100000)));

		//Collections.sort(emps);
		
		System.out.println(emps);
		
		//Collections.sort(emps,new EmpIdComparator());
		
		System.out.println(emps);
		
		//Collections.sort(emps,new EmpSalaryComparator());
		
		System.out.println(emps);
		
	}
}
