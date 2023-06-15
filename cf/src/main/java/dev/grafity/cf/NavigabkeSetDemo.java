package dev.grafity.cf;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigabkeSetDemo {
	public static void main(String[] args) {
		NavigableSet<Integer> ages = new TreeSet<>();
		ages.add(10);
		ages.add(15);
		ages.add(16);
		ages.add(18);
		ages.add(19);
		ages.add(20);
		ages.add(22);
		ages.add(25);
		System.out.println(ages);	
		System.out.println(ages.floor(21));
	}
}
