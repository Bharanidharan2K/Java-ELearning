package com.one_to_many_relationship;

import java.util.ArrayList;

public class EventType {
	private String name;	
	private ArrayList<Event> list;	
	public EventType() {}
	public EventType(String name, ArrayList<Event> list) {
		this.name = name;
		this.list = list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Event> getList() {
		return list;
	}
	public void setList(ArrayList<Event> list) {
		this.list = list;
	}
	
}
