package com.abstract_class_fund_transfer;

public class NEFTTransfer extends FundTransfer {
	public NEFTTransfer(String accountNumber, Double balance) {
		super(accountNumber, balance);
	}

	public Boolean transfer(Double transfer) {
		Double NEFT = transfer * 0.05;
		if(NEFT < this.getBalance()) {
			if(this.getBalance() - NEFT - transfer  != 0.0) {
				this.setBalance(this.getBalance()-transfer-NEFT);
				return true;
			}
		}
		return false;
	}
}
