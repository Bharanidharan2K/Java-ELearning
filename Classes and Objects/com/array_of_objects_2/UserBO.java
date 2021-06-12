package com.array_of_objects_2;

public class UserBO {
	static int capacity = 0;
	public void addUser(User[] userArray,User userIns) {
		userArray[capacity++] = userIns;
	}
	public User[] sortUsers(User[] userArray) {
		for(int i=0;i<userArray.length;i++) {
			for(int j=0;j<userArray.length;j++) {
				if(userArray[i].compareTo(userArray[j]) < 0) {
					User temp = userArray[i];
					userArray[i] = userArray[j];
					userArray[j] = temp;
				}
			}
		}
		return userArray;
	}
	public Boolean deleteUser(User[] userArray,String name) {
		for(int i=0;i<userArray.length;i++) {
			if(userArray[i].getName().equals(name)) {
				userArray[i] = null;
				return true;
			}
		}
		return false;
	}
	public void displayAll(User[] userArray) {
		System.out.println("User Details:");
		int index = 1;
		for(User i: userArray) {
			if(i != null) {
				System.out.println("User "+index++);
				System.out.println("Name:"+i.getName()+ 
						"\nMobile Number:"+i.getMobileNumber());
			}
		}
	}
}
