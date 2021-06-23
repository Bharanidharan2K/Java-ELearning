package com.overloading_basic;

public class Stall {
	protected String name;
	protected String detail;	
	protected String ownerName;
	public Stall() {}
	public Stall(String name, String detail, String ownerName) {
		this.name = name;
		this.detail = detail;
		this.ownerName = ownerName;
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
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Double computeCost(String stallType, Integer squareFeet) {
		if(stallType.equals("Platinum") ) {
			return 200.0*squareFeet;
		}
		else if(stallType.equals("Diamond")) {
			return 150.0*squareFeet;
		}
		else {
			return 100.0*squareFeet;
		}
	}
	public Double computeCost(String stallType, Integer squareFeet, Integer numberOfTV) {
		if(stallType.equals("Platinum")) {
			return 200.0*squareFeet+(numberOfTV*10000);
		}
		else if(stallType.equals("Diamond")) {
			return 150.0*squareFeet+(numberOfTV*10000);
		}
		else {
			return 100.0*squareFeet+(numberOfTV*10000);
		}
	}
}
