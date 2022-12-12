package dev.grafity.bank;

import java.util.Arrays;

public class Account {
	private int id;
	private String accountNo;
	private String accountName;
	private double balance;
	private String openingDate;
	private Transaction[] transactions = new Transaction[100];
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getOpeningDate() {
		return openingDate;
	}
	public void setOpeningDate(String openingDate) {
		this.openingDate = openingDate;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNo=" + accountNo + ", accountName=" + accountName + ", balance="
				+ balance + ", openingDate=" + openingDate + ", transactions=" + Arrays.toString(transactions) + "]";
	}
	
	
}
