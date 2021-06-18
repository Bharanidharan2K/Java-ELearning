package com.many_to_many;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of halls:");
        Integer n=Integer.parseInt(br.readLine());
        EventType eventType = new EventType();
        Hall hall = new Hall();
        System.out.println("Enter the hall details in comma separated(Name,Cost per day,Event Type-1,Event Type-2,.....,Event Type-n)");
        for(int i=0;i<n;i++) {
        	String things[] = br.readLine().split(",");
        	Hall hallObj = new Hall(things[0],Integer.parseInt(things[1]));
        	for(int j=2;j<things.length;j++) {
        		EventType eventObj = new EventType(things[j]);
        		hallObj.addToEventTypeList(eventObj);
        	}
        	eventType.addToHallList(hallObj);
        }
        List<Hall> list = eventType.getHallList();
        System.out.println("Enter the event name to get the halls:");
        String name = br.readLine();
        System.out.println("Event Name:"+name);
        int flag = 0;
        for(Hall i : list) {
        	flag = 0;
        	List<EventType> eventTypeList = i.getEventTypeList();
        	for(EventType j : eventTypeList) {
        		if(j.getName().equals(name)) {
        			flag = 1;
        			System.out.println(i.getName());
        		}
        	}
        	if(flag == 0) {
        		System.out.println("No halls are available for the event type");
        	}
        		
        }
		br.close();

	}

}
