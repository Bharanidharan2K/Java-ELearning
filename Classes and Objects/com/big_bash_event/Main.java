package com.big_bash_event;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the purchased date:");
		String dateInString = br.readLine();
		Object objIns = Event.checkEventAvailable(dateInString);
		if(objIns instanceof Date) {
			java.util.Date date = (java.util.Date) objIns;
			System.out.println("Enter purchase amount:");
			Double amount = Double.parseDouble(br.readLine());
			Double amt = Event.getAmountWithDiscount(amount, date);
			System.out.println("The discounted amount is "+amt);
		}
		else {
			System.out.println("Not Eligible for BIGBASH event");
		}
		br.close();

	}

}
