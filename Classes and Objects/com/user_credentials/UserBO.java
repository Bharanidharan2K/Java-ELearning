package com.user_credentials;

public class UserBO {
	public User[] getUsers() {
		User[] user = new User[5];
		user[0] = new User(1,"Louis","rxfsuzA2345");
		user[1] = new User(2,"Messie","hpphmf1:");
		user[2] = new User(3,"Steve","opefKt");
		user[3] = new User(4,"Kallis","23456778");
		user[4] = new User(5,"Wipro","A$%");
		return user;
	}
	private String encryptPassword(String password) {
		String encrptedPassword = "";
		char c[] = password.toCharArray();
		for(char i : c) {
			if(i != '\0') {
				i += 1;
				encrptedPassword += i;
			}
		}
		return encrptedPassword;
	}
	public boolean validate(String username, String password) {
		if(password != null) {
			User user[] = this.getUsers();
			String encryptedPassword = this.encryptPassword(password);
			for( User i : user) {
				if(i.getUsername().equals(username) && i.getPassword().equals(encryptedPassword)) {
					return true;
				}
			}
		}
		return false;
	}
}
