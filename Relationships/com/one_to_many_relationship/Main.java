package com.one_to_many_relationship;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Event> eventList = new ArrayList<>(); 
		ArrayList<EventType> eventTypeList = new ArrayList<>();
		System.out.println("Enter the type of events in CSV format");
		String eventTypeThings[] = br.readLine().split(",");
		System.out.println("Enter the number of Events");
		Integer n = Integer.parseInt(br.readLine());
		for(int i=0,index = 1;i<n;i++) {
			System.out.println("Enter the Event "+index+++" Details");
			String eventThings[] = br.readLine().split(",");
			Event event = new Event(eventThings[0],eventThings[1],eventThings[2],eventThings[3]);
			eventList.add(event);
		}
		
		for(int i=0;i<eventTypeThings.length;i++) {
			ArrayList<Event> verifiedEventList = new ArrayList<>();
			for(Event j : eventList) {
				if(j.getType().equals(eventTypeThings[i])) {
					verifiedEventList.add(j);
				}
			}
			EventType eventType = new EventType(eventTypeThings[i], verifiedEventList);
			eventTypeList.add(eventType);
		}
		EventTypeBO eventTypeBoIns = new EventTypeBO();
		eventTypeBoIns.display(eventTypeList);
		br.close();

	}

}
