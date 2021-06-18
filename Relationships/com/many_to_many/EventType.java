package com.many_to_many;

import java.util.ArrayList;
import java.util.List;

public class EventType {
	private String name;
	private List<Hall> hallList;
	
	public EventType() {}
	public EventType(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Hall> getHallList() {
		return hallList;
	}
	public void setHallList(List<Hall> hallList) {
		this.hallList = hallList;
	}
	public void addToHallList(Hall hall) {
		if(hallList == null) {
			List<Hall> list = new ArrayList<>();
			list.add(hall);
			hallList = list;
		} else {
			hallList.add(hall);
		}
	}
}
