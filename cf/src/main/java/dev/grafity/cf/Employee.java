package dev.grafity.cf;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private Double salary;
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
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
	
	public int compareTo(Employee emp) {
		return this.name.compareTo(emp.name); 
	}
	
}
