package dev.grafity.bank;

public class Transaction {
	private int transactionId;
	private String transactionDate;
	private String transactedAmount;
	private String transactionType;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactedAmount() {
		return transactedAmount;
	}
	public void setTransactedAmount(String transactedAmount) {
		this.transactedAmount = transactedAmount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
}
