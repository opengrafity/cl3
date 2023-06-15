package dev.grafity.cf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysDemo {
	public static void main(String[] args) {
		int[] ages = new int[] {10,5,6,9,8,74,5,55,32,65,98,78,45,12};
		Arrays.sort(ages);
		System.out.println(Arrays.toString(ages));
		int index = Arrays.binarySearch(ages, 10);
		System.out.println(index);
		
		List<Integer> agesList = Arrays.asList(10,5,6,9,8,74,5,55,32,65,98,78,45,12);
		System.out.println(agesList);
		
		int[] subAges = Arrays.copyOf(ages, 30);
		Arrays.fill(subAges,agesList.size(),30,-1);
		
		System.out.println(Arrays.toString(subAges)); 
		
		Collections.sort(agesList);
		System.out.println(agesList);
		System.out.println(Collections.binarySearch(agesList, 5));
		
		
	}
}
