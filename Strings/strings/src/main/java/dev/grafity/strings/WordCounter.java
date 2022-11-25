package dev.grafity.strings;

import java.util.Scanner;

public class WordCounter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = ""; 
		System.out.println("Enter a sentence");		
		sentence = sc.nextLine();
		
		String[] words = sentence.split(" ");
		
		int maxLength = words[0].length();
		String maxWord = words[0];
		
		for(int i=1;i<words.length;i++) {
			if(maxLength < words[i].length()) {
				maxLength = words[i].length();
				maxWord = words[i];
			}
		}
		
		System.out.println("Largest word is: "+maxWord);
		
		
	}
}
