package com.overloading_basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the stall:");
		String name = br.readLine();
		System.out.println("Enter the detail of the stall:");
		String detail = br.readLine();
		System.out.println("Enter the owner name of the stall:");
		String ownerName = br.readLine();
		System.out.println("Enter the type of the stall:");
		Stall stall = new Stall(name, detail, ownerName);
		String type = br.readLine();
		System.out.println("Enter the size of the stall in square feet:");
		Integer squareFeet = Integer.parseInt(br.readLine());
		System.out.println("Does the stall have TV?(y/n)");
		char choice = br.readLine().charAt(0);
		Double result;
		if(choice == 'y') {
			System.out.println("Enter the number of TV:");
			Integer noOfTv = Integer.parseInt(br.readLine());
			result = stall.computeCost(type, squareFeet, noOfTv);
		}else {
			result = stall.computeCost(type, squareFeet);
		}
		System.out.println("The cost of the stall is "+result);
		br.close();

	}

}
