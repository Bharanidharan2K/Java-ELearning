package com.super_method;

public class StageEvent extends Event{
	private Integer noOfSeats;
	
	public StageEvent() {}
	public StageEvent(Integer noOfSeats) {
		this.noOfSeats = noOfSeats; 
	}
	public Integer getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
}
