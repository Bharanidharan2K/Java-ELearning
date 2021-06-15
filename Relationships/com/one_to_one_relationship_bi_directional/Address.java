package com.one_to_one_relationship_bi_directional;

public class Address {
	private String addressLine2;	
	private String addressLine1;	
	private String city;	
	private String state;	
	private Integer pincode;	
	private Contact contact;
	
	public Address() {}
	public Address(String addressLine1, String addressLine2, String city, String state, Integer pincode) {
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
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
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Mobile:"+this.getContact().getMobile()+"\r\n" + 
				"Alternate Mobile:"+this.getContact().getAlternateMobile()+"\r\n" + 
				"Landline:"+this.getContact().getLandline()+"\r\n" + 
				"Email:"+this.getContact().getEmail()+"\r\n" + 
				"Address Line1:"+this.getAddressLine1()+"\r\n" + 
				"Address Line2:"+this.getAddressLine2()+"\r\n" + 
				"City:"+this.getCity()+"\r\n" + 
				"State:"+this.getState()+"\r\n" + 
				"Pincode:"+this.getPincode();
	}
	
}
