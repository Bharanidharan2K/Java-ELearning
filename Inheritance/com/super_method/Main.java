package com.super_method;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter your choice:\r\n" + 
				"1.Exhibition event\r\n" + 
				"2.Stage event");
		Integer choice = Integer.parseInt(br.readLine());
		switch(choice) {
		case 1:
			System.out.println("Enter the details of exhibition:");
			String things[] = br.readLine().split(",");
			
			Exhibition exhibition = new Exhibition();
			exhibition.setName(things[0]);
			exhibition.setDetail(things[1]);
			exhibition.setType(things[2]);
			exhibition.setOwnerName(things[3]);
			exhibition.setCostPerDay(Double.parseDouble(things[4]));
			exhibition.setNoOfStall(Integer.parseInt(things[5]));
			System.out.println("Enter the starting date of the event:");
			String startDateInStr = br.readLine();
			System.out.println("Enter the ending date of the event:");
			String endDateInStr = br.readLine();
			try {
				Date startDate = sd.parse(startDateInStr);
				Date endDate = sd.parse(endDateInStr);
				long timeDiff = endDate.getTime() - startDate.getTime();
				long days = (timeDiff/(1000*60*60*24));
				System.out.println(days);
				Double result = exhibition.getCostPerDay()*0.5*days;
				System.out.println("The GST to be paid is Rs."+result);
			}
			catch(Exception e) {
				System.out.println("Date format is wrong..!");
			}
			break;
		case 2:
			System.out.println("Enter the details of stage event:");
			String things1[] = br.readLine().split(",");
			
			StageEvent stageEvent = new StageEvent();
			stageEvent.setName(things1[0]);
			stageEvent.setDetail(things1[1]);
			stageEvent.setType(things1[2]);
			stageEvent.setOwnerName(things1[3]);
			stageEvent.setCostPerDay(Double.parseDouble(things1[4]));
			stageEvent.setNoOfSeats(Integer.parseInt(things1[5]));
			System.out.println("Enter the starting date of the event:");
			String startDateInStr1 = br.readLine();
			System.out.println("Enter the ending date of the event:");
			String endDateInStr1 = br.readLine();
			try {
				Date startDate = sd.parse(startDateInStr1);
				Date endDate = sd.parse(endDateInStr1);
				long timeDiff = endDate.getTime() - startDate.getTime();
				long days = (timeDiff/(1000*60*60*24));
				System.out.println(days);
				Double result = stageEvent.getCostPerDay()*0.15*days;
				System.out.println("The GST to be paid is Rs."+result);
			}
			catch(Exception e) {
				System.out.println("Date format is wrong..!");
			}
			
		}
		br.close();

	}

}
