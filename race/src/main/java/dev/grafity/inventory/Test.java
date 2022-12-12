package dev.grafity.inventory;

public class Test {
	public static void main(String[] args) {
		Grocery grocery = new Grocery("Rice","India Gate","125456582",50.0,100,"10-JAN-2020","10-JAN-25");
		Cloth cloth = new Cloth("Shirt", "LP", "9856235425", 2500, 5, "Lenin", "Blue", "M");
		Electronics electronics = new Electronics("Note2", "Micromax", "123456789", 12000, 2, "10-JAN-2021", 18, 24);
		printBill(grocery);
		printBill(cloth);
		printBill(electronics);
	}
	
	public static void printBill(Product prod) {
		System.out.println("Product Name - "+prod.getName()+" Unit Price - "+prod.getPrice()+" Total Cost- "+prod.getSalePrice());
	}

}
