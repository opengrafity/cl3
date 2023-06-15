package dev.grafity.cf;

import java.util.Date;

public class EdibleProduct extends Product{
	private Date expiryDate;

	public EdibleProduct(String name, float price) {
		super(name, price);
	}
	

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
}
