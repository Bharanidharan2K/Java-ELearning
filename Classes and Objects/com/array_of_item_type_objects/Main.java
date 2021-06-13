package com.array_of_item_type_objects;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ItemTypeBO itemtypeBOIns = new ItemTypeBO();
		System.out.println("Enter the Number of Item Type");
		Integer n = Integer.parseInt(br.readLine());
		ItemType itemTypeArray[] = new ItemType[10];
		for(Integer i=0, index = 1; i<n; i++) {
			System.out.println("Enter the Item Type "+index+++" Name");
			String name = br.readLine();
			System.out.println("Enter the Deposit Amount");
			Double deposit = Double.parseDouble(br.readLine());
			System.out.println("Enter the Cost per day");
			Double costPerDay = Double.parseDouble(br.readLine());
			ItemType itemTypeIns = new ItemType(name, deposit, costPerDay);
			itemtypeBOIns.add(itemTypeIns, itemTypeArray, i);
		}
		itemtypeBOIns.display(itemTypeArray);
		System.out.println("Enter the Name of the item to be searched");
		String searchName = br.readLine();
		itemtypeBOIns.search(searchName, itemTypeArray);
		br.close();

	}

}
