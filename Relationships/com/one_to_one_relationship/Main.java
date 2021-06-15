package com.one_to_one_relationship;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the User detail");
		String userThings[] = br.readLine().split(",");
		System.out.println("Enter the contact details");
		String contactThings[] = br.readLine().split(",");
		ContactDetail contactDetail = new ContactDetail
				(
				contactThings[0],contactThings[1],contactThings[2],
				contactThings[3],contactThings[4]
				);
		User user = new User(userThings[0],userThings[1],userThings[2],contactDetail);
		System.out.println(user);
		br.close();

	}

}
