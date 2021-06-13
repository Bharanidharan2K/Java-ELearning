package com.user_matcher;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		User user[] = new User[2];
		for( int i = 0; i <= 1; i ++ ) {
			System.out.println("Enter the details of User "+i);
			System.out.println("Name :");
			String name = br.readLine();
			System.out.println("Username :");
			String username = br.readLine();
			System.out.println("Password :");
			String password = br.readLine();
			System.out.println("Mobile Number :");
			Long mobileNumber = Long.parseLong(br.readLine());
			
			user[i] = new User(name, username, password, mobileNumber);
		}
		if(user[0].equals(user[1])) {
			System.out.println("User 1 and User 2 are equal");
		} else {
			System.out.println("User 1 and User 2 are not equal");
		}
		br.close();

	}

}
