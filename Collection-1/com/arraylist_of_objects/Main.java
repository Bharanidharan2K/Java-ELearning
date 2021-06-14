package com.arraylist_of_objects;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer index = 1;
		List<ItemType> list = new ArrayList<>();
		char check;
		do {
			System.out.println("Enter the details of Item Type "+index++);
			System.out.println("Name:");
			String name = br.readLine();
			System.out.println("Deposit:");
			Double deposit = Double.parseDouble(br.readLine());
			System.out.println("Cost Per Day:");
			Double costPerDay = Double.parseDouble(br.readLine());
			System.out.println("Do you want to continue?(y/n)");
			check = br.readLine().charAt(0);
			ItemType itemtypeIns = new ItemType(name, deposit, costPerDay);
			list.add(itemtypeIns);
		} while(check != 'n');
		System.out.printf("%-20s%-20s%-20s\n","Name", "Deposit", "CostPerDay");
		for(ItemType i : list)
			System.out.print(i);
		br.close();
	}

}
