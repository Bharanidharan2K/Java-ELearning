package com.event_and_ticket_booking_2;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;	
	private String contact;	
	private List<Event> eventList;
	
	public User() {}
	public User(String name, String contact) {
		this.name = name;
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public List<Event> getEventList() {
		return eventList;
	}
	public void setEventList(List<Event> eventList) {
		this.eventList = eventList;
	}
	public void addEventList(Event event) {
		if(eventList == null) {
			List<Event> list = new ArrayList<>();
			list.add(event);
			eventList = list;
		}
		else {
			eventList.add(event);
		}
	}
}

