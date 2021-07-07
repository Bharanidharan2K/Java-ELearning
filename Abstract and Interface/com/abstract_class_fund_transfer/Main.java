package com.abstract_class_fund_transfer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your account number:");
		String accountNumber = br.readLine();
		System.out.println("Enter the balance of the account:");
		Double balance = Double.parseDouble(br.readLine());
		System.out.println("Enter the type of transfer to be made:\r\n" + 
				"1.NEFT\r\n" + 
				"2.IMPS\r\n" + 
				"3.RTGS");
		Integer choice = Integer.parseInt(br.readLine());
		if(choice == 1) {
			System.out.println("Enter the amount to be transferred:");
			Double transfer = Double.parseDouble(br.readLine());
			FundTransfer neftTransfer = new NEFTTransfer(accountNumber, balance);
			if(neftTransfer.validate(transfer)) {
				if(neftTransfer.transfer(transfer)) {
					System.out.println("Transfer occurred successfully");
					System.out.println("Remaining balance is "+neftTransfer.getBalance());
				}
				else {
					System.out.println("Transfer could not be made");
				}
			}
			else {
				System.out.println("Account number or transfer amount seems to be wrong");
			}
		}
		if(choice == 2) {
			System.out.println("Enter the amount to be transferred:");
			Double transfer = Double.parseDouble(br.readLine());
			FundTransfer impsTransfer = new IMPSTransfer(accountNumber, balance);
			if(impsTransfer.validate(transfer)) {
				if(impsTransfer.transfer(transfer)) {
					System.out.println("Transfer occurred successfully");
					System.out.println("Remaining balance is "+impsTransfer.getBalance());
				}
				else {
					System.out.println("Transfer could not be made");
				}
			}
			else {
				System.out.println("Account number or transfer amount seems to be wrong");
			}
		}
		if(choice == 3) {
			System.out.println("Enter the amount to be transferred:");
			Double transfer = Double.parseDouble(br.readLine());
			FundTransfer rtgsTransfer = new RTGSTransfer(accountNumber, balance);
			if(rtgsTransfer.validate(transfer)) {
				if(rtgsTransfer.transfer(transfer)) {
					System.out.println("Transfer occurred successfully");
					System.out.println("Remaining balance is "+rtgsTransfer.getBalance());
				}
				else {
					System.out.println("Transfer could not be made");
				}
			}
			else {
				System.out.println("Account number or transfer amount seems to be wrong");
			}
		}
		br.close();

	}

}
