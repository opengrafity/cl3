package dev.grafity.race;

public class Bike {
	static int version = 2;
	private String regNo;
	private String modelName;
	private String manufacturerName;
	private int cc;
	private int maxSpeed;
	private int currentSpeed;
	private int noOfGares;
	private int currentGare;
	private int fuelCapacity;
	private String breakType;

	public Bike(String regNo,String modelName,String manufacturerName,int cc,int maxSpeed,int noOfGares,int fuelCapacity,String breakType) {
		this.regNo = regNo;
		this.modelName = modelName;
		this.manufacturerName = manufacturerName;
		this.cc = cc;
		this.maxSpeed = maxSpeed;
		this.noOfGares = noOfGares;
		this.fuelCapacity = fuelCapacity;
		this.breakType = breakType;
	}
	
	public void accelerate(int bySpeed){
		currentSpeed += bySpeed;		
	}

	public void applyBreak() {
		currentSpeed = 0;
		currentGare = 0;
	}
	
	public void gareUp() {
		currentGare+=1;
	}	
	
	public void gareDown() {
		currentGare-=1;
	}

	public int getCurrentGare() {
		return currentGare;
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getModelName() {
		return modelName;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public int getNoOfGares() {
		return noOfGares;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public String getBreakType() {
		return breakType;
	}

	public void setBreakType(String breakType) {
		this.breakType = breakType;
	}

	@Override
	public String toString() {
		return "Bike "+regNo+" running at "+currentSpeed+"kmph maintaining "+currentGare+" gare"; 
	}
	
	public static String getName() {
		return "Jai Hindh " + version;
	} 
}
