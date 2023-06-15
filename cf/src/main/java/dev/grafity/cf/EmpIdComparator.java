package dev.grafity.cf;

import java.util.Comparator;

public class EmpIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee x, Employee y) {
		return Integer.compare(x.getId(), y.getId());
	}
	
}
