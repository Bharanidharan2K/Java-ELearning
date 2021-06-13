package com.user_matcher;

public class User {
	private String name;	
	private String username;	
	private String password;	
	private Long mobileNumber;
	public User() {
		super();
	}
	public User(String name, String username, String password, Long mobileNumber) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.mobileNumber = mobileNumber;
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
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public boolean equals(User user) {
		if(this.getMobileNumber().equals(user.getMobileNumber()))
			return true;
		else
			return false;
	}
	
	
}
