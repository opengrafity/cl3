package dev.grafity.inventory;

public class Grocery extends Product{
	private String packedDate;
	private String expiryDate;
	
	public Grocery() {
		super();
		System.out.println("Grocery Constructor");
		
	}
	public Grocery(String name, String manufacturer, String barcode, double price, int quantityInHand,String packedDate, String expiryDate) {
		super(name,manufacturer,barcode,price,quantityInHand);
		this.packedDate = packedDate;
		this.expiryDate = expiryDate;
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
	@Override
	public String toString() {
		return "Grocery [packedDate=" + packedDate + ", expiryDate=" + expiryDate + "]";
	}
	@Override
	public double getSalePrice() {
		return price+(price*0.05);
	}
}
