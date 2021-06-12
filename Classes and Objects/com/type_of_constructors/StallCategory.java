package com.type_of_constructors;

public class StallCategory {
	private String name;	
	private String detail;
	
	public StallCategory() {}
	public StallCategory(String name, String detail) {
		this.name = name;
		this.detail = detail;
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
	
	public void display() {
		System.out.println("Details of the stall category:\r\n" + 
				"Name:"+getName()+"\r\n" + 
				"Detail:"+getDetail());
	}
	
}
