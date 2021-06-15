package com.one_to_one_relationship_bi_directional;

public class Contact {
	private Integer mobile;	
	private Integer alternateMobile;	
	private Integer landline;	
	private String email;	
	private Address address;	
	
	public Contact() {}
	public Contact(Integer mobile, Integer alternateMobile, Integer landline, String email) {
		this.mobile = mobile;
		this.alternateMobile = alternateMobile;
		this.landline = landline;
		this.email = email;
	}
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	public Integer getAlternateMobile() {
		return alternateMobile;
	}
	public void setAlternateMobile(Integer alternateMobile) {
		this.alternateMobile = alternateMobile;
	}
	public Integer getLandline() {
		return landline;
	}
	public void setLandline(Integer landline) {
		this.landline = landline;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public boolean equals(Contact c) {
		return this.getMobile().equals(c.getMobile()) ||
				this.getAlternateMobile().equals(c.getAlternateMobile()) ||
				this.getLandline().equals(c.getLandline());
	}
}
