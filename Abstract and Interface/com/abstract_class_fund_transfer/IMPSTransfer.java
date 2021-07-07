package com.abstract_class_fund_transfer;

public class IMPSTransfer extends FundTransfer {
	public IMPSTransfer(String accountNumber, Double balance) {
		super(accountNumber, balance);
	}

	public Boolean transfer(Double transfer) {
		Double IMPS = transfer * 0.02;
		if(this.getBalance() > IMPS) {
			if(this.getBalance() - IMPS - transfer != 0.0) {
				this.setBalance(this.getBalance()- IMPS - transfer);
				return true;
			}
		}
		return false;
	}
}
