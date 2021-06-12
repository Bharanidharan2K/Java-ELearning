package com.getters_and_setters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Item Type Name");
		String name = br.readLine();
		System.out.println("Enter the Deposit Amount");
		Double deposit = Double.parseDouble(br.readLine());
		System.out.println("Enter the Cost per day of the Item Type");
		Double costPerDay = Double.parseDouble(br.readLine());
		ItemType itemTypeIns = new ItemType(name, deposit, costPerDay);
		itemTypeIns.display();
		br.close();
	}

}
