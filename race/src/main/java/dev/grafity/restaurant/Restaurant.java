package dev.grafity.restaurant;

import java.util.Arrays;

public class Restaurant {
	private String name;
	private Branch[] branches = new Branch[100];
	private int branchCount = 0;
	public void addBranch(Branch branch) {
		this.branches[branchCount++] = branch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Branch[] getBranches() {
		return branches;
	}
	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", branches=" + Arrays.toString(branches) + ", branchCount=" + branchCount
				+ "]";
	}
}
