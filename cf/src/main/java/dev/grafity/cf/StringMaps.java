package dev.grafity.cf;

import java.util.Set;
import java.util.TreeMap;

public class StringMaps {
	public static void main(String[] args) {
		String passage = "janaganamana adhinayaka jayahe, bharatha bhagya vidhataha... janaganamana adhinayaka jayahe, bharatha bhagya vidhataha... panjab sidhu gujarath maraata dravida uthkala vanga.";
		String[] words = passage.split(" ");
		
		java.util.Map<String,Integer> wordsCount = new TreeMap<>();
		int noOfOccurances = 0;
		for(String word:words) {
			if(wordsCount.containsKey(word)) {
				noOfOccurances = wordsCount.get(word); 
				wordsCount.put(word, ++noOfOccurances);
			}else {
				wordsCount.put(word, 1);
			}
		}
		
		Set<java.util.Map.Entry<String,Integer>> entrySet = wordsCount.entrySet();
		/*
		 * Iterator<java.util.Map.Entry<String,Integer>> entryItr = entrySet.iterator();
		 * java.util.Map.Entry<String,Integer> entry = null; while(entryItr.hasNext()) {
		 * entry = entryItr.next(); System.out.println(entry.getKey() +
		 * " repeated "+entry.getValue() +"time(s)"); }
		 */
		
		for(java.util.Map.Entry<String,Integer> entryObj:entrySet) {
			System.out.println(entryObj.getKey() + " repeated "+entryObj.getValue() +"time(s)");
		}
	}
}
