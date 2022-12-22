package dev.grafity.race;

import java.util.Arrays;

public class Order {
	private String orderNo;
	private String orderDate;
	private String orderStatus;	
	private int noOfDishesAdded=0;
	
	
	public Order(String orderNo, String orderDate) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getNoOfDishesAdded() {
		return noOfDishesAdded;
	}
	public void setNoOfDishesAdded(int noOfDishesAdded) {
		this.noOfDishesAdded = noOfDishesAdded;
	}
	
}
