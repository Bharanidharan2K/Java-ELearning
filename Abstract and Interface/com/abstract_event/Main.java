package com.abstract_event;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your choice\r\n" + 
				"1.Exhibition\r\n" + 
				"2.StageEvent");
		Integer choice = Integer.parseInt(br.readLine());
		if(choice == 1) {
			System.out.println("Enter the details in CSV format");
			String things[] = br.readLine().split(",");
			Exhibition exhibition = new Exhibition(things[0],things[1],things[2],things[3],Integer.parseInt(things[4]), Double.parseDouble(things[5]));
			System.out.println("Exhibition Details\r\n" + 
					"Event Name:"+exhibition.getName()+"\r\n" + 
					"Detail:"+exhibition.getDetail()+"\r\n" + 
					"Type:"+exhibition.getType()+"\r\n" + 
					"Organiser Name:"+exhibition.getOrganiser()+"\r\n" + 
					"Total Cost:"+exhibition.calculateAmount());
		}
		if(choice == 2) {
			System.out.println("Enter the details in CSV format");
			String things[] = br.readLine().split(",");
			StageEvent stageEvent = new StageEvent(things[0],things[1],things[2],things[3],Integer.parseInt(things[4]), Double.parseDouble(things[5]));
			System.out.println("Stage Event Details\r\n" + 
					"Event Name:"+stageEvent.getName()+"\r\n" + 
					"Detail:"+stageEvent.getDetail()+"\r\n" + 
					"Type:"+stageEvent.getType()+"\r\n" + 
					"Organiser Name:"+stageEvent.getOrganiser()+"\r\n" + 
					"Total Cost:"+stageEvent.calculateAmount());
		}
		br.close();

	}

}
