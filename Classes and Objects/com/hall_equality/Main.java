package com.hall_equality;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		Hall hall[] = new Hall[2];
		for(int i=0,index = 1;i<=1;i++) {
			System.out.println("Enter the details of Hall "+index++);
			System.out.println("Name :");
			String name = br.readLine();
			System.out.println("Contact Number :");
			Long contactNumber = Long.parseLong(br.readLine());
			System.out.println("Cost Per Day :");
			Double costPerDay = Double.parseDouble(br.readLine());
			System.out.println("Owner Name :");
			String ownerName = br.readLine();
			System.out.println("Booking Date(dd/mm/yyyy) :");
			String dateInString = br.readLine();
			Date date = sd.parse(dateInString);
			hall[i] = new Hall(name, contactNumber, costPerDay, ownerName, date);
			
		}
		if(hall[0].equals(hall[1] ))
			System.out.println("Halls are same");
		else
			System.out.println("Halls are different");
		br.close();

	}

}
