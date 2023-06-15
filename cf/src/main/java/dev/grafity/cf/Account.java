package dev.grafity.cf;

public class Account {
	private Integer id;
	private String name;
	private Double balance;
	private Address presentAddress;
	private Address perminantAddress;
	private Address branchAddress;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Address getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(Address presentAddress) {
		this.presentAddress = presentAddress;
	}

	public Address getPerminantAddress() {
		return perminantAddress;
	}

	public void setPerminantAddress(Object perminantAddress) {
		this.perminantAddress = (Address)perminantAddress;
	}

	public Address getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(Address branchAddress) {
		this.branchAddress = branchAddress;
	}
	public Object createAddressObject(String doorNo,String streetName,String areaName,String cityName,String pincode) {
		Address obj = new Address();
		obj.setDoorNo(doorNo);
		obj.setStreetName(streetName);
		obj.setAreaName(areaName);
		obj.setCityName(cityName);
		obj.setPincode(pincode);
		return obj;
	}

	public static class Address {
		private String doorNo;
		private String streetName;
		private String areaName;
		private String cityName;
		private String pincode;
		
		public String getDoorNo() {
			return doorNo;
		}
		public void setDoorNo(String doorNo) {
			this.doorNo = doorNo;
		}
		public String getStreetName() {
			return streetName;
		}
		public void setStreetName(String streetName) {
			this.streetName = streetName;
		}
		public String getAreaName() {
			return areaName;
		}
		public void setAreaName(String areaName) {
			this.areaName = areaName;
		}
		public String getCityName() {
			return cityName;
		}
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		public String getPincode() {
			return pincode;
		}
		public void setPincode(String pincode) {
			this.pincode = pincode;
		}
	}
}
