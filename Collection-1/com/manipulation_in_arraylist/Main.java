package com.manipulation_in_arraylist;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Hall> list = new ArrayList<>();
		HallBO hallBO = new HallBO();
		list = hallBO.getHallList();
		Integer choice;
		do {
			System.out.println("Enter an option:\r\n" + 
					"1.Add\r\n" + 
					"2.Replace\r\n" + 
					"3.Display\r\n" + 
					"4.Exit");
			choice = Integer.parseInt(br.readLine());
			switch(choice) {
			case 1:
				System.out.println("Enter the name of the hall:");
				String name = br.readLine();
				System.out.println("Enter the contact number of the hall:");
				String contactNumber = br.readLine();
				System.out.println("Enter the cost per day of the hall:");
				Double costPerDay = Double.parseDouble(br.readLine());
				System.out.println("Enter the owner name of the hall:");
				String ownerName = br.readLine();
				list.add(new Hall(name, contactNumber, costPerDay, ownerName));
				System.out.println("Hall added successfully");
				break;
			case 2:
				System.out.println("Enter the hall number which should be replaced:");
				Integer numberReplace = Integer.parseInt(br.readLine());
				System.out.println("Enter the name of the replacement hall:");
				String nameReplace = br.readLine();
				System.out.println("Enter the contact number of the replacement hall:");
				String contactReplace = br.readLine();
				System.out.println("Enter the cost per day of the replacement hall:");
				Double costPerDayReplace = Double.parseDouble(br.readLine());
				System.out.println("Enter the owner name of the replacement hall:");
				String ownerNameReplace = br.readLine();
				list.set(numberReplace-1, new Hall(nameReplace, contactReplace, costPerDayReplace, ownerNameReplace));
				System.out.println("Hall replaced successfully");
				break;
			case 3:
				System.out.printf("%-20s%-20s%-20s%-20s\n", "Name", "Contact Number", "Cost Per Day", "Owner name");
				hallBO.displayAll(list);
				break;
			case 4:
				System.out.println("Exiting Application");
				break;
			}
			
		} while(choice != 4);
		br.close();
	}

}
