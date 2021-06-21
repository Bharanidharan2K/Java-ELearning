package com.account_details;

public class FixedAccount extends SavingAccount{
	protected Integer lockingPeriod;
	public FixedAccount() {}
	public FixedAccount(String accountNumber, Double balance, String accountHolderName,Double minimumBalance,Integer lockingPeriod) {
		super(accountNumber,balance,accountHolderName,minimumBalance);
		this.lockingPeriod = lockingPeriod;
	}
	public Integer getLockingPeriod() {
		return lockingPeriod;
	}
	public void setLockingPeriod(Integer lockingPeriod) {
		this.lockingPeriod = lockingPeriod;
	}
	
}
