package dev.grafity.inventory;

public class ElectronicProduct {
	private String productName;
	private String manufacturerName;
	private String productBarCode;
	private double price;
	private String manufacturedDate;
	private int voltage;
	private int warrenty;
	private int quantityInHand;
	
	public ElectronicProduct() {
		super();
	}
	public ElectronicProduct(String productName, String manufacturerName, String productBarCode, double price,
			String manufacturedDate, int voltage, int warrenty, int quantityInHand) {
		super();
		this.productName = productName;
		this.manufacturerName = manufacturerName;
		this.productBarCode = productBarCode;
		this.price = price;
		this.manufacturedDate = manufacturedDate;
		this.voltage = voltage;
		this.warrenty = warrenty;
		this.quantityInHand = quantityInHand;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
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
	public String getManufacturedDate() {
		return manufacturedDate;
	}
	public void setManufacturedDate(String manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	public int getVoltage() {
		return voltage;
	}
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
	public int getWarrenty() {
		return warrenty;
	}
	public void setWarrenty(int warrenty) {
		this.warrenty = warrenty;
	}
	public int getQuantityInHand() {
		return quantityInHand;
	}
	public void setQuantityInHand(int quantityInHand) {
		this.quantityInHand = quantityInHand;
	}
	@Override
	public String toString() {
		return "ElectronicProduct [productName=" + productName + ", manufacturerName=" + manufacturerName
				+ ", productBarCode=" + productBarCode + ", price=" + price + ", manufacturedDate=" + manufacturedDate
				+ ", voltage=" + voltage + ", warrenty=" + warrenty + ", quantityInHand=" + quantityInHand + "]";
	}
}
