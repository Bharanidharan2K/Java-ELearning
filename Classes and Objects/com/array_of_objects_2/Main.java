package com.array_of_objects_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		UserBO userBOIns = new UserBO();
		System.out.println("Enter the number of users:");
		Integer numberOfUser = Integer.parseInt(br.readLine());
		User []userArray = new User[numberOfUser];
		for(int i=0,index = 1;i<numberOfUser;i++) {
			System.out.println("Enter the details of User "+index++);
			System.out.println("Enter the name of the user:");
			String name = br.readLine();
			System.out.println("Enter the mobile number of the user:");
			String mobileNumber = br.readLine();
			System.out.println("Enter the username of the user:");
			String username = br.readLine();
			System.out.println("Enter the password of the user:");
			String password = br.readLine();
			User userIns = new User(name, mobileNumber, username, password);
			userBOIns.addUser(userArray, userIns);
		}
		System.out.println("User details as entered:");
		userBOIns.displayAll(userArray);
		
		userBOIns.sortUsers(userArray);
		System.out.println("After sorting:");
		userBOIns.displayAll(userArray);
		System.out.println("Enter the user to be deleted:");
		String deleteName = br.readLine();
		if(userBOIns.deleteUser(userArray, deleteName)) {
			System.out.println("User deleted successfully");
			System.out.println("After Deleting:");
			userBOIns.displayAll(userArray);
		} else {
			System.out.println("No user found with the given name");
		}
		br.close();

	}

}
