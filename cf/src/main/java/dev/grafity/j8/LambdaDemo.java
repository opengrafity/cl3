package dev.grafity.j8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee>{
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}
}

class StringComparer{
	public static int compareEmployees(Employee one,Employee two) {
		return one.getName().compareTo(two.getName());
	}
}


interface EmployeeCreator{
	Employee createEmployee(Integer empId, String name, Double salary);
}


class EmployeeUtil{
	public Employee generateEmployee(Integer empId, String name, Double salary, EmployeeCreator creator) {
		return creator.createEmployee(empId, name, salary);
	}
	
	public Employee getEmployee(Integer empId, String name, Double salary) {
		Employee emp = new Employee(empId, name, salary);
		return emp;
	}
}

public class LambdaDemo {
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		
		emps.add(new Employee(1, "Geetha", 650000.0));
		emps.add(new Employee(2, "Seetha", 550000.0));
		emps.add(new Employee(3, "Sujatha", 950000.0));
		emps.add(new Employee(5, "Kavitha", 250000.0));
		emps.add(new Employee(4, "Latha", 850000.0));
		
		Collections.sort(emps,new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {		
				return o1.getSalary().compareTo(o2.getSalary());
			}
			
		});
		System.out.println(emps);
				
		Collections.sort(emps,(o1,o2) -> o1.getName().compareTo(o2.getName()));
		
		System.out.println(emps);
		
		StringComparer strComp = new StringComparer();
		
		Collections.sort(emps, StringComparer::compareEmployees);
		System.out.println(emps);
		
		EmployeeUtil empUtil = new EmployeeUtil();
		Employee emp = empUtil.generateEmployee(1, "Krishna", 2500000.0D, new EmployeeCreator() {

			@Override
			public Employee createEmployee(Integer empId, String name, Double salary) {
				return new Employee(empId,name,salary);
			}
			
		});
		
		System.out.println(emp);
		
		emp = empUtil.generateEmployee(2, "Kumar", 2500000.0D,(empId,name,salary) -> new Employee(empId,name,salary));
		
		System.out.println(emp);
		
		emp = empUtil.generateEmployee(3, "Raja", 2500000.0D, empUtil::getEmployee);
		
		System.out.println(emp);
		
		emp = empUtil.generateEmployee(3, "Ramu", 2500000.0D, Employee::new);
		
		System.out.println(emp);
		
	}
}
