package com.bo_classes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter the details of the item type\nName:");
		String name = br.readLine();
		System.out.println("Deposit:");
		Double deposit = Double.parseDouble(br.readLine());
		System.out.println("Cost Per Day");
		Double costPerDay = Double.parseDouble(br.readLine());
		System.out.println("Enter the starting date:");
		String startDateInString = br.readLine();
		Date startDate = sd.parse(startDateInString);
		System.out.println("Enter the ending date:");
		String endDateInString = br.readLine();
		Date endDate = sd.parse(endDateInString);
		ItemType itemTypeIns = new ItemType(name, deposit, costPerDay);
		ItemTypeBO itemTypeBOIns = new ItemTypeBO();
		System.out.println("The total cost is Rs."+
				itemTypeBOIns.calculateCost(startDate, endDate, itemTypeIns));
		br.close();

	}

}
