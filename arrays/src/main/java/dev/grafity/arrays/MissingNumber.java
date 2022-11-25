package dev.grafity.arrays;

public class MissingNumber {
	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,3,10,20,30,34,24,54,37,90,100};
		for(int i=1;i<=100;i++) {
			if(!isPresentInArray(numbers, i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean isPresentInArray(int[] allNumbers,int key) {
		for(int i=0;i<allNumbers.length;i++) {
			if(allNumbers[i] == key) {
				return true;
			}
		}
		return false;
	}
}
