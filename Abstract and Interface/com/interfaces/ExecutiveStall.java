package com.interfaces;

public class ExecutiveStall implements Stall {
	String stallName;
	Integer cost;
	String ownerName;
	Integer screen;
	
	public String getStallName() {
		return stallName;
	}
	public void setStallName(String stallName) {
		this.stallName = stallName;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Integer getScreen() {
		return screen;
	}
	public void setScreen(Integer screen) {
		this.screen = screen;
	}
	public ExecutiveStall() {}
	public ExecutiveStall(String stallName, Integer cost, String ownerName, Integer screen) {
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.screen = screen;
	}
	public void display() {
		System.out.println("Stall Name:"+this.getStallName()+"\r\n" + 
				"Cost:"+this.getCost()+".Rs\r\n" + 
				"Owner Name:"+this.getOwnerName()+"\r\n" + 
				"Number of Screens:"+this.getScreen());
	}
}
