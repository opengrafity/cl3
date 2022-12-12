package dev.grafity.inventory;

public class Electronics extends Product{
	private String manufacturedDate;
	private int voltage;
	private int warrenty;
	
	public Electronics() {
		super();
	}
	public Electronics(String manufacturedDate, int voltage, int warrenty) {
		super();
		this.manufacturedDate = manufacturedDate;
		this.voltage = voltage;
		this.warrenty = warrenty;
	}
	
	public Electronics(String name, String manufacturer, String barcode, double price, int quantityInHand,String manufacturedDate, int voltage, int warrenty) {
		super(name, manufacturer, barcode, price, quantityInHand);
		this.manufacturedDate = manufacturedDate;
		this.voltage = voltage;
		this.warrenty = warrenty;
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
	@Override
	public double getSalePrice() {
		return price+(price*0.18);
	}
	@Override
	public String toString() {
		return "Electronics [manufacturedDate=" + manufacturedDate + ", voltage=" + voltage + ", warrenty=" + warrenty
				+ "]";
	}
	
}
