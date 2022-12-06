package dev.grafity.race;

public class RaceBike extends Bike{
	
	private int speedGasCapacity;


	public RaceBike(String regNo, String modelName, String manufacturerName, int cc, int maxSpeed, int noOfGares,int fuelCapacity, String breakType, int speedGasCapacity) {
		super(regNo,modelName,manufacturerName,cc,maxSpeed,noOfGares,fuelCapacity,breakType);
		this.speedGasCapacity = speedGasCapacity;	
	}	

	public int getSpeedGasCapacity() {
		return speedGasCapacity;
	}
	 
}
