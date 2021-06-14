package com.list_remove_and_is_empty;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Hall> list = new ArrayList<>();
		Boolean flag = false;
		Hall hall = null;
		char check = 0;
		do {
			System.out.println("Action\r\n" + 
					"1.Add Hall\r\n" + 
					"2.Remove Hall\r\n" + 
					"Enter your choice");
			Integer choice = Integer.parseInt(br.readLine());
			switch(choice) {
			case 1:
				System.out.println("Enter the Hall details in CSV format");
				String things[] = br.readLine().split(",");
				hall = new Hall(things[0],things[1],Double.parseDouble(things[2]), things[3]);
				list.add(hall);
				break;
				
			case 2:
				if(!list.isEmpty()) {
					System.out.println("Enter the index of the hall to be removed");
					int removed = Integer.parseInt(br.readLine());
					list.remove(removed);
					System.out.printf("%-20s%-20s%-20s%-20s\n","Hall name", "Contact number", "Cost per day", "Owner name");
					hall.display(list);
				}
				else {
					System.out.println("The list is empty");
					flag = true;
				}
				break;
				
			default :
				System.out.println("Please enter a valid choice");
				break;
				
			}
			if(flag)
				check = 'n';
			else {
				System.out.println("Do you want to continue?(Y/N)");
				check = br.readLine().charAt(0);
			}
			check = Character.toLowerCase(check);
			
		} while(check != 'n');
		br.close();
	}

}
