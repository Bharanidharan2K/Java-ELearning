package com.super_keyword_constructor;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose Event type\r\n" + 
				"1.Exhibition\r\n" + 
				"2.StageEvent");
		Integer choice = Integer.parseInt(br.readLine());
		switch(choice) {
		case 1:
			System.out.println("Enter the details in CSV format");
			String things[] = br.readLine().split(",");
			Exhibition exhibition = new Exhibition(things[0],things[1],things[2],things[3],Integer.parseInt(things[4]));
			System.out.println("Event Name:"+exhibition.getName()+"\r\n" + 
					"Detail:"+exhibition.getDetail()+"\r\n" + 
					"Type:"+exhibition.getType()+"\r\n" + 
					"Organiser Name:"+exhibition.getOrganiserName()+"\r\n" + 
					"Number of seats:" +exhibition.getNoOfStalls()
					);
			break;
		case 2:
			System.out.println("Enter the details in CSV format");
			String things1[] = br.readLine().split(",");
			StageEvent stageEvent = new StageEvent(things1[0],things1[1],things1[2],things1[3],Integer.parseInt(things1[4]));
			System.out.println("Event Name:"+stageEvent.getName()+"\r\n" + 
					"Detail:"+stageEvent.getDetail()+"\r\n" + 
					"Type:"+stageEvent.getType()+"\r\n" + 
					"Organiser Name:"+stageEvent.getOrganiserName()+"\r\n" + 
					"Number of seats:"+stageEvent.getNoOfSeats());
			break;
		default :
			System.out.println("Invalid choice");
		}
		br.close();

	}

}
