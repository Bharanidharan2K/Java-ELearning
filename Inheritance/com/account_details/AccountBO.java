package com.account_details;

public class AccountBO {
	public FixedAccount getAccountDetail(String detail) {
		String details[] = detail.split(",");
		FixedAccount fixedAccount = new FixedAccount(details[0],Double.parseDouble(details[1]), details[2],Double.parseDouble(details[3]),Integer.parseInt(details[4]));
		return fixedAccount;
	}
}
