package dev.grafity.restaurant;

import java.util.Arrays;

public class Branch {
	private String branchName;
	private Order[] orders = new Order[1000];
	private int noOfOrders = 0;
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public Order[] getOrders() {
		return orders;
	}
	public void addOrder(Order ord) {
		this.orders[noOfOrders++] = ord;
	}
	@Override
	public String toString() {
		return "Branch [branchName=" + branchName + ", orders=" + Arrays.toString(orders) + ", noOfOrders=" + noOfOrders
				+ "]";
	}	
}
