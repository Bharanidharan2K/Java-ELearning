package com.overriding_tostring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Address Line 1");
		String addressLine1 = br.readLine();
		System.out.println("Enter Address Line 2");
		String addressLine2 = br.readLine();
		System.out.println("Enter the City Name");
		String city = br.readLine();
		System.out.println("Enter the State Name");
		String state = br.readLine();
		System.out.println("Enter the Pincode");
		Integer pincode = Integer.parseInt(br.readLine());
		
		Address addressIns = new Address(addressLine1, addressLine2, city, state, pincode);
		System.out.println(addressIns);
		br.close();

	}

}
