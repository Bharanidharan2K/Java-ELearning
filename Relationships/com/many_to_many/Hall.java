package com.many_to_many;

import java.util.ArrayList;
import java.util.List;

public class Hall {
	private String name;
	private Integer costPerDay;
	private List<EventType> eventTypeList;
	public Hall() {}
	public Hall(String name, Integer costPerDay) {
		this.name = name;
		this.costPerDay = costPerDay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(Integer costPerDay) {
		this.costPerDay = costPerDay;
	}
	public List<EventType> getEventTypeList() {
		return eventTypeList;
	}
	public void setEventTypeList(List<EventType> eventTypeList) {
		this.eventTypeList = eventTypeList;
	}
	public void addToEventTypeList(EventType eventType) {
		if(eventTypeList == null) {
			List<EventType> list = new ArrayList<>();
			list.add(eventType);
			eventTypeList = list;
		} else {
			eventTypeList.add(eventType);
		}
	}
}
