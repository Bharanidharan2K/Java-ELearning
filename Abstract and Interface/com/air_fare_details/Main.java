package com.air_fare_details;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the source city:");
		String sourceCity = br.readLine();
		System.out.println("Enter the destination city:");
		String destinationCity = br.readLine();
		System.out.println("Enter the flight\r\n" + 
				"1.Air India\r\n" + 
				"2.Indigo");
		Integer choice = Integer.parseInt(br.readLine());
		if(choice == 1) {
			AirIndia airIndia = new AirIndia();
			Double fares = airIndia.showFare(sourceCity, destinationCity);
			System.out.println("The fare is "+fares);
		}
		else if(choice == 2) {
			Indigo indigo = new Indigo();
			Double fares = indigo.showFare(sourceCity, destinationCity);
			System.out.println("The fare is "+fares);
		}
		else {
			System.out.println("Invalid choice");
		}
		br.close();

	}

}
