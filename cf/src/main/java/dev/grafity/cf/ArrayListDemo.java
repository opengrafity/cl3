package dev.grafity.cf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		Collection<Integer> minorAges = new ArrayList<>();
		minorAges.add(10);
		minorAges.add(12);
		minorAges.add(15);
		System.out.println(minorAges);
		minorAges.add(15);
		System.out.println(minorAges);
		minorAges.add(13);
		System.out.println(minorAges);

		
		
		Collection<Integer> majorAges = new ArrayList<>();
		majorAges.add(20);
		majorAges.add(32);
		majorAges.add(25);
		majorAges.add(27);
		majorAges.add(43);
		
		List<Integer> allAges = new ArrayList<>();
		System.out.println(allAges);
		allAges.addAll(minorAges);
		System.out.println(allAges);
		allAges.addAll(majorAges);
		System.out.println(allAges);
		
		//allAges.retainAll(minorAges);
		System.out.println(allAges);
		
		System.out.println(allAges.contains(11));
		
		allAges.set(2, 75);
		System.out.println(allAges);
		
		List<Integer> voterAges = new LinkedList<>();
		voterAges.add(19);
		voterAges.add(28);
		voterAges.add(29);
		allAges.addAll(1,voterAges);
		System.out.println(allAges);
		
		for(Integer age:allAges) {
			if(age>=40) {
				System.out.println(age);
			}
		}
		
		ListIterator<Integer> ageIterator = allAges.listIterator();
		int element = 0;
		while(ageIterator.hasNext()) {
			element = ageIterator.next();
			if(element < 30) {
				ageIterator.remove();
			}
		}
		
		while(ageIterator.hasPrevious()) {
			System.out.println(ageIterator.previous());
		}
	}
}
