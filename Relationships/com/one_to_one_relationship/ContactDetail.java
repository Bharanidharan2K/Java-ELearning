package com.one_to_one_relationship;

public class ContactDetail {
	private String mobile;
	private String alternateMobile;	
	private String landLine;	
	private String email;	
	private String address;	
	
	public ContactDetail() {}
	public ContactDetail(String mobile, String alternateMobile, String landline, String email, String address) {
		this.mobile = mobile;
		this.alternateMobile = alternateMobile;
		this.landLine = landline;
		this.email = email;
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAlternateMobile() {
		return alternateMobile;
	}
	public void setAlternateMobile(String alternateMobile) {
		this.alternateMobile = alternateMobile;
	}
	public String getLandLine() {
		return landLine;
	}
	public void setLandLine(String landLine) {
		this.landLine = landLine;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "\nMobile:"+this.getMobile()+"\r\n" + 
				"Alternate mobile:"+this.getAlternateMobile()+"\r\n" + 
				"LandLine:"+this.getLandLine()+"\r\n" + 
				"Email:"+this.getEmail()+"\r\n" + 
				"Address:"+this.getAddress();
	}
}
