package com.abstract_class_fund_transfer;

public class RTGSTransfer extends FundTransfer {

	public RTGSTransfer(String accountNumber, Double balance) {
		super(accountNumber, balance);
	}

	public Boolean transfer(Double transfer) {
		Double RTGS = 10000.0;
		if(transfer > RTGS) {
			if(this.getBalance() - transfer != 0) {
				this.setBalance(this.getBalance()-transfer);
				return true;
			}
				
		}
		return false;
	}

}
