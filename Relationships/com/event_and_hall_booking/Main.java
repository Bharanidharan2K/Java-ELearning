package com.event_and_hall_booking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Event> eventList = new ArrayList<>();
		List<Hall> hallList = new ArrayList<>();
		List<HallBooking> hallBookingList = new ArrayList<>();
		Hall hall = new Hall();
		Event event = new Event();
		SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter the number of events:");
		Integer noOfEvent = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfEvent;i++) {
			String things[] = br.readLine().split(",");
			Event eventObj = new Event(things[0],things[1],things[2],things[3]);
			hall.addEventList(eventObj);
		}
		eventList = hall.getEventList(); 
		System.out.println("Enter the number of halls:");
		Integer noOfHall = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfHall;i++) {
			String things[] = br.readLine().split(",");
			Hall hallObj = new Hall(things[0],things[1],Double.parseDouble(things[2]),things[3]);
			event.addHallList(hallObj);
		}
		hallList = event.getHallList();
		System.out.println("Enter the number of bookings:");
		Integer noOfBooking = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfBooking;i++) {
			String things[] = br.readLine().split(",");
			Hall hallObj = new Hall();
			Event eventObj = new Event();
			for(Hall j : hallList) {
				if(things[0].equals(j.getName())) {
					hallObj = j;
					break;
				}
			}
			for(Event j : eventList) {
				if(things[1].equals(j.getName())) {
					eventObj = j;
					break;
				}
			}
			Date start = sd.parse(things[2]);
			Date end = sd.parse(things[3]);
			HallBooking hallBooking = new HallBooking(hallObj, eventObj, start, end, Double.parseDouble(things[4]));
			hallBookingList.add(hallBooking);
			
		}
		System.out.println("Enter a hall name to be searched:");
		String hallName = br.readLine();
		System.out.println("Bookings for the "+hallName);
		System.out.format("%-15s %-15s %-15s %s\n","Event Name","Start Date","End Date","Price");
		for(HallBooking i : hallBookingList) {
			if(i.getHall().getName().equals(hallName)) {
				System.out.printf("%-15s %-15s %-15s %s\n",
						i.getEvent().getName(),
						sd.format(i.getStartDate()),
						sd.format(i.getEndDate()),
						i.getPrice());
			}
		}
		br.close();

	}

}
