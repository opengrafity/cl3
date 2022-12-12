package dev.grafity.inventory;

public class GroceryProduct {
	private String productName;
	private String manufacturer;
	private String productBarCode;
	private String packedDate;
	private String expiryDate;
	private double price;
	private int quantityInHand;
	
	
	public GroceryProduct() {
		super();
	}
	
	public GroceryProduct(String productName, String manufacturer, String productBarCode, String packedDate,
			String expiryDate, double price, int quantityInHand) {
		super();
		this.productName = productName;
		this.manufacturer = manufacturer;
		this.productBarCode = productBarCode;
		this.packedDate = packedDate;
		this.expiryDate = expiryDate;
		this.price = price;
		this.quantityInHand = quantityInHand;
	}

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getProductBarCode() {
		return productBarCode;
	}
	public void setProductBarCode(String productBarCode) {
		this.productBarCode = productBarCode;
	}
	public String getPackedDate() {
		return packedDate;
	}
	public void setPackedDate(String packedDate) {
		this.packedDate = packedDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
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
	@Override
	public String toString() {
		return "GroceryProduct [productName=" + productName + ", manufacturer=" + manufacturer + ", productBarCode="
				+ productBarCode + ", packedDate=" + packedDate + ", expiryDate=" + expiryDate + ", price=" + price
				+ ", quantityInHand=" + quantityInHand + "]";
	}
	
}
