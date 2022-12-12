package dev.grafity.inventory;

public abstract class Product {
	private String name;
	private String manufacturer;
	private String barcode;
	protected double price;
	private int quantityInHand;
	
	public Product() {
		System.out.println("Product Constructor");
	}
	
	public Product(String name, String manufacturer, String barcode, double price, int quantityInHand) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.barcode = barcode;
		this.price = price;
		this.quantityInHand = quantityInHand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantityInHand() {
		return quantityInHand;
	}
	public void setQuantityInHand(int quantityInHand) {
		this.quantityInHand = quantityInHand;
	}	
	public abstract double getSalePrice();
	@Override
	public String toString() {
		return "Product [name=" + name + ", manufacturer=" + manufacturer + ", barcode=" + barcode + ", price=" + price
				+ ", quantityInHand=" + quantityInHand + "]";
	}
}
