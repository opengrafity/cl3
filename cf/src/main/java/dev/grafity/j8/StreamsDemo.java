package dev.grafity.j8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsDemo {
	public static void main(String[] args) {
		/*
		 * Stream .of(1,2,3,4,5,6,10,54,6,8,79,5,4) .forEach(System.out::println);
		 * 
		 * Stream mySream = Stream.generate(()->{ return 10; });
		 * 
		 * mySream.limit(10).forEach(System.out::println);
		 * 
		 * Stream.iterate(1, e->e+1).limit(100).forEach(System.out::println);
		 * 
		 * Stream one = Stream.of(1,2,3,4,5,6,10,54,6,8,79,5,4);
		 * 
		 * Stream two = Stream.of(300,400);
		 * 
		 * Stream three = Stream.concat(one, two);
		 * 
		 * three.forEach(System.out::println);
		 * 
		 * System.out.println("Completed");
		 * 
		 * List<Integer> ages = Arrays.asList(20,30,40,50,60,70,8,0); Stream four =
		 * ages.stream();
		 * 
		 * four.forEach(System.out::println);
		 */
		
		Stream.of(45,68,78,98,65,21,32,1,2,3)
		.flatMap(e->{
			return Stream.iterate(1, i->i+1).limit(e);	
		})
		.forEach(System.out::println);
		
		Stream.of("Vamsi","Krishna","Kumar","Raja").map(e->e.length()).forEach(System.out::println);
		
		Stream.of("Vamsi","Krishna","Kumar","Raja").peek(System.out::print).map(e->e.length()).forEach(System.out::println);
		
		List<Integer> nums = Arrays.asList(45,68,78,98,65,21,32,1,2,3,12,12,121,21,21,245,45,487,87,875,64,41,654,646,4,54,5,56,65,45,454);
		nums.parallelStream().filter(e->e%2==0).forEach(System.out::println);
		
		
	}
}
