package dev.grafity.arrays;

public class Dedup {
	public static void main(String[] args) {
		int numbers[] = new int[] {10,2,9,8,10,62,31,25,14};
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i] == numbers[j]) {
					System.out.println(numbers[i]+" deplicated");
					break;
				}
			}
		}
	}
}
