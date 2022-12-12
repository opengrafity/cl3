package dev.grafity.inventory;

public class Cloth extends Product{
	private String fabric;
	private String color;
	private String size;
	
	public Cloth() {
		super();
	}
	public Cloth(String name, String manufacturer, String barcode, double price, int quantityInHand,String fabric, String color, String size) {
		super(name, manufacturer, barcode, price, quantityInHand);
		this.fabric = fabric;
		this.color = color;
		this.size = size;
	}
	public Cloth(String fabric, String color, String size) {
		super();
		this.fabric = fabric;
		this.color = color;
		this.size = size;
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
	public double getSalePrice() {
		return price+(price*0.09);
	}
	@Override
	public String toString() {
		return "Cloth [fabric=" + fabric + ", color=" + color + ", size=" + size + "]";
	}
	
}
