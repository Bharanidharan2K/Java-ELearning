package com.user_credentials;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Username :");
		String username = br.readLine();
		System.out.println("Password :");
		String password = br.readLine();
		UserBO userBo = new UserBO();
		if(userBo.validate(username, password)) {
			System.out.println("Login Successfull");
		} else {
			System.out.println("Incorrect username/password");
		}
		br.close();

	}

}
