package com.one_to_many_relationship;

import java.util.ArrayList;

public class EventTypeBO {
	public void display(ArrayList<EventType> list) {
		for(EventType i : list) {
			System.out.println("Event Type:"+i.getName());
			System.out.printf("%-20s%-20s%-20s\n","Name","Detail","Organiser Name");
			ArrayList<Event> eventList = i.getList();
			for(Event j : eventList)
				System.out.printf("%-20s%-20s%-20s\n",j.getName(),j.getDetail(),j.getOrganiserName());
		}
	}
}
