package dev.grafity.cf;

public class InflableProduct extends Product{
	private int maxRoomTemp;

	
	public InflableProduct(String name, float price, int maxRoomTemp) {
		super(name, price);
		this.maxRoomTemp = maxRoomTemp;
	}

	public int getMaxRoomTemp() {
		return maxRoomTemp;
	}

	public void setMaxRoomTemp(int maxRoomTemp) {
		this.maxRoomTemp = maxRoomTemp;
	}

	
	
}
