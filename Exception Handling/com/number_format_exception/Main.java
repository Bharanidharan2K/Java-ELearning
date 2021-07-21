package com.number_format_exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the Item type details:\r\n" + 
					"Enter the name:");
			String name = br.readLine();
			System.out.println("Enter the deposit:");
			Double deposit = Double.parseDouble(br.readLine());
			System.out.println("Enter the cost per day:");
			Double costPerDay = Double.parseDouble(br.readLine());
			ItemType itemType = new ItemType(name, deposit, costPerDay);
			System.out.println("The details of the item type are:");
			System.out.println(itemType);
		} 
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		
		br.close();
	}

}
