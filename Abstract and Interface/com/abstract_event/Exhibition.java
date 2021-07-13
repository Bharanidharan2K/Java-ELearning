package com.abstract_event;

public class Exhibition extends Event{
	Integer noOfStalls;	
	Double rentPerStall;
	public Exhibition() {}
	public Exhibition(String name, String detail, String type, String organiser, Integer noOfStalls, Double rentPerStall) {
		super(name,detail,type,organiser);
		this.noOfStalls = noOfStalls;
		this.rentPerStall = rentPerStall;
	}
	public Integer getNoOfStalls() {
		return noOfStalls;
	}
	public void setNoOfStalls(Integer noOfStalls) {
		this.noOfStalls = noOfStalls;
	}
	public Double getRentPerStall() {
		return rentPerStall;
	}
	public void setRentPerStall(Double rentPerStall) {
		this.rentPerStall = rentPerStall;
	}
	public Double calculateAmount () {
		return this.getRentPerStall()*this.getNoOfStalls();
	}
}
