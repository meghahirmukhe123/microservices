package com.bankuser.entity;

public class money {
	
	private String lockerId;
	private String totalAmount;
	private int numOfAccount;
	public money(String lockerId, String totalAmount, int numOfAccount) {
		super();
		this.lockerId = lockerId;
		this.totalAmount = totalAmount;
		this.numOfAccount = numOfAccount;
	}
	public money() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLockerId() {
		return lockerId;
	}
	public void setLockerId(String lockerId) {
		this.lockerId = lockerId;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getNumOfAccount() {
		return numOfAccount;
	}
	public void setNumOfAccount(int numOfAccount) {
		this.numOfAccount = numOfAccount;
	}
	@Override
	public String toString() {
		return "money [lockerId=" + lockerId + ", totalAmount=" + totalAmount + ", numOfAccount=" + numOfAccount + "]";
	}
	
	

}
