package dev.grafity.cf;

public class App {
	public static void main(String[] args) {
	
		Float[] array = new Float[] {10F,20F,30F,40.0F,50F,60F,70F};
		Utility<Float> utilObj = new Utility<>();
		int index = utilObj.findIndex(array, 50F);
		System.out.println(index);
		
		Integer[] numbers = new Integer[] {1,2,3,4,50,6,70,80,90,42};
		Utility<Integer> intUtil = new Utility<>();
		index = intUtil.findIndex(numbers, 90);
		System.out.println(index);
		
		
	}
}
