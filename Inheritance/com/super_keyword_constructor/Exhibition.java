package com.super_keyword_constructor;

public class Exhibition extends Event{
	private Integer noOfStalls;
	public Exhibition() {}
	public Exhibition(String name, String detail, String type, String organiserName, Integer noOfStalls) {
		super(name, detail,type, organiserName);
		this.noOfStalls = noOfStalls;
		
	}
	public Integer getNoOfStalls() {
		return noOfStalls;
	}
	public void setNoOfStalls(Integer noOfStalls) {
		this.noOfStalls = noOfStalls;
	}
	
}
