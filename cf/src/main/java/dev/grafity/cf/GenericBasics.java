package dev.grafity.cf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MathUtil {
	public static <T extends Product> Double totalBil(List<T> products) {
		Double total = 0.0;
		for(T p:products) {
			total += p.getPrice();
		}
		return total;
	}


	public static <T> Object[] subArray(T[] numbers, Integer size) {

		Object[] resultArray = new Object[size];
		for (int i = 0; i < size; i++) {
			resultArray[i] = numbers[i];
		}
		return resultArray;
	}
	public static <U> int findIndex(U[] numbers, U key ) {
		for(int i=0;i<numbers.length;i++) {
			if(key.equals(numbers[i])) {
				return i;
			}
		}
		return -1;
	}
	
	public static List<?> subList(List<?> elements, Integer size) {

		List resultList = new ArrayList();
		for (int i = 0; i < size; i++) {
			resultList.add(elements.get(i));
		}
		return resultList;
	}
}
class KeyStore<U,V>{
	private List<U> keys = new ArrayList<>();
	private List<V> values = new ArrayList<>();
		
	public void add(U key, V value) {
		keys.add(key);
		values.add(value);
	}
	
	public V get(U key) {
		for(int i=0;i<keys.size();i++) {
			if(key.equals(keys.get(i))) {
				return values.get(i);
			}
		}
		return null;
	}
		
}
public class GenericBasics {
	public static void main(String[] args) {
		Integer[] array = new Integer[] { 10, 20, 30, 40, 50, 60, 70, 80, 15, 25, 35 };
		Object[] result = MathUtil.<Integer>subArray(array, 5);
		System.out.println(Arrays.toString(result));

		Float[] fArray = new Float[] { 10.25f, 20.12f, 30.35f, 40.85f, 50.32f, 60.18f, 70.12f, 80.05f, 15.98f, 25.35f,35.25f };
		Object[] fResult = MathUtil.<Float>subArray(fArray, 5);
		System.out.println(Arrays.toString(fResult));
		System.out.println(MathUtil.<Integer> findIndex(array, 50));
		System.out.println(MathUtil.<Float> findIndex(fArray, 50.32f));
		
		KeyStore<Integer,String> store = new KeyStore<>();
		store.add(1, "Skillyheads Pvt Ltd");
		store.add(2, "Naidupet");
		store.add(3, "Software Development");
		
		
		System.out.println(store.get(1));
		
		KeyStore<Integer,Integer> intStore = new KeyStore<>();
		intStore.add(1,10);
		intStore.add(2,20);
		intStore.add(3,80);
		
		
		System.out.println(intStore.get(3));
		Employee emp = new Employee();
		Employee empTwo = new Employee();
		
		Product prdOne = new Product("Mic", 25000);
		EdibleProduct prdTwo = new EdibleProduct("dairyMilk", 25);
		InflableProduct prdThree = new InflableProduct("Petrol", 100,95);
		
		List<Product> prds = new ArrayList<Product>();
		prds.add(prdOne);
		prds.add(prdTwo);
		prds.add(prdThree);
		
		System.out.println(MathUtil.<Product> totalBil(prds));
		
	}
}
