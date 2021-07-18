package com.interfaces;

public class GoldStall implements Stall {
	String stallName;
	Integer cost;
	String ownerName;
	Integer tvSet;
	
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
	public Integer getTvSet() {
		return tvSet;
	}
	public void setTvSet(Integer tvSet) {
		this.tvSet = tvSet;
	}
	public GoldStall() {}
	public GoldStall(String stallName, Integer cost, String ownerName, Integer tvSet) {
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.tvSet = tvSet;
	}
	public void display() {
		System.out.println("Stall Name:"+this.getStallName()+"\r\n" + 
				"Cost:"+this.getCost()+".Rs\r\n" + 
				"Owner Name:"+this.getOwnerName()+"\r\n" + 
				"Number of TV sets:"+this.getTvSet());
	}
}
