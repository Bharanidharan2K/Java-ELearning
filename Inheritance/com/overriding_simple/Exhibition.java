package com.overriding_simple;

public class Exhibition extends Event{
	private Integer noOfStall;
	
	public Exhibition() {}
	public Exhibition(String name, String detail, String ownerName,Integer noOfStall) {
		super(name, detail, ownerName);
		this.noOfStall = noOfStall;
	}
	public Integer getNoOfStall() {
		return noOfStall;
	}
	public void setNoOfStall(Integer noOfStall) {
		this.noOfStall = noOfStall;
	}
	public Double projectedRevenue() {
		return this.getNoOfStall()*10000.0;
	}
}
