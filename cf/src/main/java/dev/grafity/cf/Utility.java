package dev.grafity.cf;

public class Utility<U> {
	public int findIndex(U[] array, U key) {
		for(int i=0;i<array.length;i++) {
			if(array[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}		
}
