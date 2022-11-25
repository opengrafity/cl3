package dev.grafity.strings;

import java.util.Objects;

public class StringsDemo {
	public static void main(String[] args) {
				
		String name = new String("Vandhematharam");
		
		String nameObj = new String("Vandhematharam");
		
		System.out.println(name.charAt(3));
		
		System.out.println(name.compareToIgnoreCase("vandhematharam"));
		
		System.out.println(name.concat(", Jaihind"));
		
		System.out.println(name.contains("matharam"));
		
		String first = "Vandhematharam";
		String second = "Vandhematharama";
		
		System.out.println(first ==  second);
		
		
		String firstObj = new String("Vandhematharam");
		String secondObj = new String("Vandhematharama");
		
		System.out.println(firstObj ==  secondObj);
		
		System.out.println(second.lastIndexOf("mam"));
		
		String emails = "deepak@grafity.dev;janakiram@grafity.dev;sjagadeesh@grafity.dev";
		
		String[] emailArr = emails.split(";");
		
		System.out.println(emailArr[0]);
		System.out.println(emailArr[1]);
		System.out.println(emailArr[2]);
		
		String third = "    Jai Hind    ";
		System.out.println(third.substring(3));
		System.out.println(third.trim().equals("Jai Hind"));
		
	}
}
