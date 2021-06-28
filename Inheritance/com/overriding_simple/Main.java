package com.overriding_simple;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the event:");
		String name = sc.nextLine();
		System.out.println("Enter the detail of the event:");
		String detail = sc.nextLine();
		System.out.println("Enter the owner name of the event:");
		String ownerName = sc.nextLine();
		System.out.println("Enter the type of the event:");
		System.out.println("1.Exhibition\r\n" + 
				"2.StageEvent");
		Integer choice = Integer.parseInt(sc.nextLine());
		if(choice == 1) {
			System.out.println("Enter the number of stalls:");
			Integer noOfStall = Integer.parseInt(sc.nextLine());
			Exhibition exhibition = new Exhibition(name, detail, ownerName, noOfStall);
			System.out.println("The projected revenue of the event is "+exhibition.projectedRevenue());
		}
		if(choice == 2) {
			System.out.println("Enter the number of shows:");
			Integer noOfShows = Integer.parseInt(sc.nextLine());
			System.out.println("Enter the number of seats per show:");
			Integer noOfSeatsPerShow = Integer.parseInt(sc.nextLine());
			StageEvent stageEvent = new StageEvent(noOfShows, noOfSeatsPerShow);
			System.out.println("The projected revenue of the event is "+stageEvent.projectedRevenue());
		}
		sc.close();

	}

}
