package com.super_method;

public class Exhibition extends Event{
	private Integer noOfStall;
	
	public Exhibition() {}
	public Exhibition(Integer noOfStall) {
		this.noOfStall = noOfStall;
	}
	public Integer getNoOfStall() {
		return noOfStall;
	}
	public void setNoOfStall(Integer noOfStall) {
		this.noOfStall = noOfStall;
	}
	
}
