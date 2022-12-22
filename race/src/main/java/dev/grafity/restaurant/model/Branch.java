package dev.grafity.restaurant.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Branch {
	private String branchName;
	private LinkedList<Order> orders = new LinkedList<>();
	private int noOfOrders = 0;
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public LinkedList<Order> getOrders() {
		return orders;
	}
	public void addOrder(Order ord) {
		this.orders.add(ord);
	}
	@Override
	public String toString() {
		return "Branch [branchName=" + branchName + ", orders=" + orders + ", noOfOrders=" + noOfOrders
				+ "]";
	}	
}
