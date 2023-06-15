package dev.grafity.cf;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee x, Employee y) {
		return x.getName().compareTo(y.getName());
	}

}
