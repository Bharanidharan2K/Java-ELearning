package com.list_remove_and_is_empty;

import java.util.ArrayList;

public class Hall {
	private String name;	
	private String contactNumber;	
	private Double costPerDay;	
	private String ownerName;
	public Hall() {
		super();
	}
	public Hall(String name, String contactNumber, Double costPerDay, String ownerName) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.costPerDay = costPerDay;
		this.ownerName = ownerName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void display(ArrayList<Hall> list) {
		for(Hall i : list)
			System.out.printf("%-20s%-20s%-20s%-20s\n",i.getName(), i.getContactNumber(),i.getCostPerDay(), i.getOwnerName());
	}
}
