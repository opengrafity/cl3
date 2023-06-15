package dev.grafity.j8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
@FunctionalInterface
interface Print{
	void print(String str);
}

class AllCapsPrint implements Print{
	Predicate<String> test;
	@Override
	public void print(String str) {
		System.out.println(str.toUpperCase());
	}
	
}

class AllSmallsPrint implements Print{

	@Override
	public void print(String str) {
		System.out.println(str.toLowerCase());
	}
	
}

class TitlePrint implements Print{

	@Override
	public void print(String str) {
		String[] words = str.split(" ");
		StringBuilder result= new StringBuilder();
		for(String word:words) {
			result.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
		}
		System.out.println(result.toString());
	}
	
}

class CamelPrint implements Print{

	@Override
	public void print(String str) {
		String[] words = str.split(" ");
		StringBuilder result= new StringBuilder();
		for(String word:words) {
			result.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
		}
		System.out.println(result.toString());
	}
	
}

public class FIDemo {
	public static void printInCaps(String str) {
		System.out.println(str.toUpperCase());
	}
	public static void printInSmalls(String str) {
		System.out.println(str.toLowerCase());
	}
	public static void printInTitleCaps(String str) {
		String[] words = str.split(" ");
		StringBuilder result= new StringBuilder();
		for(String word:words) {
			result.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
		}
		System.out.println(result.toString());
	}
	
	public static void filterAndPrint(List<String> slogans,String printType) {
		for(String slogan:slogans) {
			if(slogan.length()<150) {
				switch(printType) {
				case "CAPS":
					printInCaps(slogan);
					break;
				case "SMALL":
					printInSmalls(slogan);
					break;
				case "TITLE":
					printInTitleCaps(slogan);
					break;
				default:
					System.out.println("Invalid Print Type");
				}
			}
		}
	}
	
	public static void filterAndPrint(List<String> slogans,Print print, Predicate<String> condition) {
		for(String slogan:slogans) {
			if(condition.test(slogan)) {
				print.print(slogan);
			}
		}
	}
	
	public static void main(String[] args) {
		List<String> slogans = new ArrayList<>();
		slogans.add("Vandhematharam");
		slogans.add("Janaganamana adhinayaka jayahe");
		slogans.add("Bharath Mathaki Jai");
		slogans.add("Inquilab Jindhabad");
		slogans.add("Sathyameva Jayathe");
		slogans.add("Good Morning Good Morning Good Morning Good Morning Good MorningGood Morning Good MorningGood MorningGood MorningGood Morning Good Morning Good Morning Good MorningGood MorningGood Morning Good Morning Good Morning Good Morning Good Morning Good Morning Good Morning Good Morning");
		
//		filterAndPrint(slogans, "TITLE");
		
		filterAndPrint(slogans,str->{
			String[] words = str.split(" ");
			StringBuilder result= new StringBuilder();
			for(String word:words) {
				result.append(word.substring(0, 1).toUpperCase()).append(" ");
			}
			System.out.println(result.toString());
		},
				
		(str)-> {	
			return str.length()<150?true:false;
		}); 
	}
}
