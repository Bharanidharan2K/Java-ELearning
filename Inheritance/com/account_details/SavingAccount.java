package com.account_details;

public class SavingAccount extends Account{
	protected Double minimunBalance;
	public SavingAccount() {}
	public SavingAccount(String accountNumber, Double balance, String accountHolderName,Double minimumBalance) {
		super(accountNumber,balance,accountHolderName);
		this.minimunBalance = minimumBalance;
	}
	public Double getMinimunBalance() {
		return minimunBalance;
	}
	public void setMinimunBalance(Double minimunBalance) {
		this.minimunBalance = minimunBalance;
	}
}
