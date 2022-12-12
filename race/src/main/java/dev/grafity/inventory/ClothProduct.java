package dev.grafity.inventory;

public class ClothProduct {
	private String productName;
	private String manufactirerName;
	private String productBarCode;
	private double price;
	private String fabric;
	private String color;
	private String size;
	private int quantityInHand;
	
	public ClothProduct() {
		super();
	}
	public ClothProduct(String productName, String manufactirerName, String productBarCode, double price, String fabric,
			String color, String size, int quantityInHand) {
		super();
		this.productName = productName;
		this.manufactirerName = manufactirerName;
		this.productBarCode = productBarCode;
		this.price = price;
		this.fabric = fabric;
		this.color = color;
		this.size = size;
		this.quantityInHand = quantityInHand;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getManufactirerName() {
		return manufactirerName;
	}
	public void setManufactirerName(String manufactirerName) {
		this.manufactirerName = manufactirerName;
	}
	public String getProductBarCode() {
		return productBarCode;
	}
	public void setProductBarCode(String productBarCode) {
		this.productBarCode = productBarCode;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getFabric() {
		return fabric;
	}
	public void setFabric(String fabric) {
		this.fabric = fabric;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getQuantityInHand() {
		return quantityInHand;
	}
	public void setQuantityInHand(int quantityInHand) {
		this.quantityInHand = quantityInHand;
	}
	@Override
	public String toString() {
		return "ClothProduct [productName=" + productName + ", manufactirerName=" + manufactirerName
				+ ", productBarCode=" + productBarCode + ", price=" + price + ", fabric=" + fabric + ", color=" + color
				+ ", size=" + size + ", quantityInHand=" + quantityInHand + "]";
	}
	
}
