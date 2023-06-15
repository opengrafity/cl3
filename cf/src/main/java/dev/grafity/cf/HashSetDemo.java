package dev.grafity.cf;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Dish> dishes = new LinkedHashSet<>();
		dishes.add(new Dish("Apple", 80, "Indian", "Juice"));
		dishes.add(new Dish("Mango", 80, "Indian", "Juice"));
		dishes.add(new Dish("Orange", 80, "Indian", "Juice"));
		dishes.add(new Dish("Veg Noodles", 80, "Chainiese", "Juice"));
		dishes.add(new Dish("Veg Biryani", 80, "Indian", "Juice"));
		dishes.add(new Dish("Veg Margarita", 80, "Maxican", "Juice"));
		
		System.out.println(dishes.size());
		
		Iterator<Dish> dishesItr =  dishes.iterator();
		while(dishesItr.hasNext()) {
			System.out.println(dishesItr.next());
		}
	}
}
