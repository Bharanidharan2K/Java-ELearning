package com.user_search;

public class User implements Comparable<User>{
	private String username;	
	private String bankname;
	
	public User() {}
	public User(String username, String bankname) {
		this.username = username;
		this.bankname = bankname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	@Override
	public int compareTo(User o) {
		return this.getUsername().compareTo(o.getUsername());
	}
	public boolean equals(User o) {
		return this.getUsername().equals(o.getUsername());
	}
	
	
	
}
