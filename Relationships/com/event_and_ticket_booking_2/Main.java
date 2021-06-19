package com.event_and_ticket_booking_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
		User user = new User();
		Event event = new Event();
		List<User> userList = new ArrayList<>();
		List<Event> eventList = new ArrayList<>();
		List<TicketBooking> bookingList = new ArrayList<>();
		System.out.println("Enter the number of events:");
		Integer noOfEvents = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfEvents;i++) {
			String things[] = br.readLine().split(",");
			Event eventObj = new Event(things[0],things[1],things[2],things[3]);
			user.addEventList(eventObj);
		}
		eventList = user.getEventList();
		System.out.println("Enter the number of users:");
		Integer noOfUsers = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfUsers;i++) {
			String things[] =br.readLine().split(",");
			User userObj = new User(things[0],things[1]);
			event.addUserList(userObj);
		}
		userList = event.getUserList();
		System.out.println("Enter the number of bookings:");
		Integer noOfBookings = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfBookings;i++) {
			String things[] = br.readLine().split(",");
			User userObj = new User();
			Event eventObj = new Event();
			for(Event j : eventList) {
				if(j.getName().equals(things[0])) {
					eventObj = j;
					break;
				}
			}
			for(User j : userList) {
				if(j.getName().equals(things[2])) {
					userObj = j;
					break;
				}
			}
			Date bookingTime = sd.parse(things[1]);
			TicketBooking ticketBooking = new TicketBooking(eventObj,bookingTime,userObj,Double.parseDouble(things[3]));
			bookingList.add(ticketBooking);
		}
		System.out.println("Enter the customer name:");
		String customerName = br.readLine();
		System.out.println("Enter the event name to be deleted from the customer:");
		String eventName = br.readLine();
		System.out.println("Bookings for "+customerName);
		System.out.format("%-15s %-15s %-15s %s\n","Event Name","Booking Time","Customer","Price");
		for(TicketBooking i : bookingList) {
			if(i.getCustomer().getName().equals(customerName)) {
				if(i.getEvent().getName().equals(eventName)) {
					bookingList.remove(i);
				}
				else {
					System.out.format("%-15s %-15s %-15s %s\n",
							i.getEvent().getName(),
							sd.format(i.getBookingTime()),
							i.getCustomer().getName(),
							i.getPrice());
				}
			}
			
		}
		br.close();

	}

}
