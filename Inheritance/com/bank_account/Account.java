package com.bank_account;

public class Account {
	protected String accName;	
	protected String accNo;	
	protected String bankName;
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	protected void display() {
		System.out.println("Account Name:"+this.getAccName()+"\r\n" + 
				"Account Number:"+this.getAccNo()+"\r\n" + 
				"Bank Name:"+this.getBankName());
	}
}
