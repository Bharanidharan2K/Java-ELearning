package com.account_details;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter account Detail:");
		String detail = br.readLine();
		AccountBO accountBO = new AccountBO();
		FixedAccount fixedAccount = accountBO.getAccountDetail(detail);
		System.out.println("Account Details:");
		System.out.format("%-20s %-10s %-20s %-20s %s\n","Account Number","Balance","Account holder name","Minimum balance","Locking period");
		System.out.printf("%-20s %-10s %-20s %-20s %s\n",fixedAccount.getAccountNumber(),fixedAccount.getBalance(),fixedAccount.getAccountHolderName(),fixedAccount.getMinimunBalance(),fixedAccount.getLockingPeriod());
		br.close();

	}

}
