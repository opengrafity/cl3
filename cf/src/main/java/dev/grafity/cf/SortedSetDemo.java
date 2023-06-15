package dev.grafity.cf;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet<Integer> ages = new TreeSet<>();
		ages.add(10);
		ages.add(7);
		ages.add(15);
		ages.add(12);
		ages.add(35);
		ages.add(25);
		ages.add(26);
		ages.add(30);
		System.out.println(ages);
		SortedSet<Integer> subAges =  ages.tailSet(25);
		
		System.out.println(subAges);
		subAges.add(80);
		
		System.out.println(subAges);
		System.out.println(ages);
		
		SortedSet<Dish> dishes = new TreeSet<Dish>();
		dishes.add(new Dish("Mango Juice",100,"Indian","Juices"));
		dishes.add(new Dish("Apple Juice",90,"Indian","Juices"));
		dishes.add(new Dish("Lime Juice",30,"Indian","Juices"));
		dishes.add(new Dish("Pomo Juice",100,"Indian","Juices"));
		dishes.add(new Dish("Pomo Juice",80,"Indian","Juices"));
		System.out.println(dishes);
		
		SortedSet<Dish> subSet = dishes.headSet(new Dish("Pomo Juice",80,"Indian","Juices"));
		System.out.println(subSet);

		
		
	}
}
