package com.bank_account;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose Account Type\r\n" + 
				"1.Savings Account\r\n" + 
				"2.Current Account");
		Integer choice = Integer.parseInt(br.readLine());
		switch(choice) {
		case 1:
			System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
			String thingsSave[] = br.readLine().split(",");
			Account savingAccount = new SavingsAccount(thingsSave[0],thingsSave[1],thingsSave[2],thingsSave[3]);
			savingAccount.display();
			break;
		case 2:
			System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
			String thingsCurr[] = br.readLine().split(",");
			Account currentAccount = new SavingsAccount(thingsCurr[0],thingsCurr[1],thingsCurr[2],thingsCurr[3]);
			currentAccount.display();
			break;
		}
		br.close();

	}

}
