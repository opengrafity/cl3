package dev.grafity.arrays;

public class PrintArray {
	public static void main(String[] args) {
		int nums[] = new int[7];
		nums[0] = 10;
		nums[1] = 50;
		nums[2] = 0;
		nums[3] = 40;
		nums[4] = 35;
		nums[5] = 0;
		nums[6] = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == 0) {
				System.out.println(i+1);
			}
		}
		
	}
}
