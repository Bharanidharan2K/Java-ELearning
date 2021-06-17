package com.one_to_many_remove_user;

public class Hall {
	private String name;	
	private Integer costPerDay;	
	private String ownerName;
	
	public Hall() {}
	public Hall(String name, Integer costPerDay, String ownerName) {
		this.name = name;
		this.costPerDay = costPerDay;
		this.ownerName = ownerName;
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
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
}
