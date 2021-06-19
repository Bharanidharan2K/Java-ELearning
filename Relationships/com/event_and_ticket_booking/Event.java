package com.event_and_ticket_booking;

import java.util.ArrayList;
import java.util.List;

public class Event {
	private String name;	
	private String detail;	
	private String type;	
	private String owner;	
	List<User> userList;
	public Event() {}
	public Event(String name, String detail, String type, String owner) {
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.owner = owner;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	public void addUserList(User user) {
		if(userList == null) {
			List<User> list = new ArrayList<>();
			list.add(user);
			userList = list;
		}
		else {
			userList.add(user);
		}
	}
	
}
