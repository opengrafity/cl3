package dev.grafity.cf;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> ages = new LinkedList<>();
		ages.add(10);
		ages.add(15);
		ages.add(16);
		ages.add(8);
		System.out.println(ages);
		Integer key = ages.remove();
		System.out.println(key);
		key = ages.remove();
		System.out.println(key);
		key = ages.remove();
		System.out.println(key);
		key = ages.element();
		System.out.println(key);
		System.out.println(ages);
		key = ages.poll();
		System.out.println(key);
		System.out.println("Vandhematharam");
	}
}
