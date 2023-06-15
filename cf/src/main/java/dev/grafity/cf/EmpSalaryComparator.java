package dev.grafity.cf;

import java.util.Comparator;

public class EmpSalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee x, Employee y) {
		return x.getSalary().compareTo(y.getSalary());
	}

}
