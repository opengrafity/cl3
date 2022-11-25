package dev.grafity.strings;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		int size = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		size = sc.nextInt();
		
		int[] numbers = new int[size];
		System.out.println("Enter " + size + " numbers");
		
		for(int i=0;i<size;i++) {
			numbers[i] = sc.nextInt();
		}
		// 10, 7, 13 , 16, 18
		
		int number = 0;
		
		for(int j=0;j<numbers.length;j++) {
			number = numbers[j];
			if(isPrime(number)) {
				System.out.println(number + "is prime");
			}
		}		
	}
	
	static boolean isPrime(int number){
		boolean isPrime = true;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
