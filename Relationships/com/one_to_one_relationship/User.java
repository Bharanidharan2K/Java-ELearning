package com.one_to_one_relationship;

public class User {
	private String name;	
	private String username;	
	private String password;	
	private ContactDetail contactDetail;
	
	public User() {}
	public User(String name, String username, String password, ContactDetail contactDetail) {
		this.name = name;
		this.username = username;
		this.password = password;
		this.contactDetail = contactDetail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ContactDetail getContactDetail() {
		return contactDetail;
	}
	public void setContactDetail(ContactDetail contactDetail) {
		this.contactDetail = contactDetail;
	}
	@Override
	public String toString() {
		return "Name:"+this.getName()+"\r\n" + 
				"Username:"+this.getUsername()+"\r\n" + 
				"Password:"+this.getPassword()+"\r\n" + 
				"Contact detail:"+this.getContactDetail();
	}
}
