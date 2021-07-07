package com.abstract_class_fund_transfer;

public abstract class FundTransfer {
	private String accountNumber;	
	private Double balance;
	
	public FundTransfer() {}
	public FundTransfer(String accountNumber, Double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Boolean validate(Double transfer) {
		if(this.getBalance() > transfer && transfer > 0 && this.getAccountNumber().length() == 10 ) return true;
		return false;
	}
	public abstract Boolean transfer(Double transfer);
}
