package com.overriding_tostring;

public class Address {
	private String addressLine1;	
	private String addressLine2;	
	private String city;	
	private String state;	
	private Integer pincode;
	
	public Address() {}
	public Address(String addressLine1, String addressLine2, String city,String state, Integer pincode) {
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
//	Override String
	public String toString() {
		return "The Address Details are\n" + 
				getAddressLine1() +"\n" 
				+getAddressLine2()+"\n" 
				+getCity()+"\n"
				+getState()+"\n"
				+getPincode()+"\n" ;
	}
	
}
