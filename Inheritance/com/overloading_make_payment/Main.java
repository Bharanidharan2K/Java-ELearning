package com.overloading_make_payment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Booking details");
		String details[] = sc.nextLine().split(",");
		TicketBooking ticketBooking = new TicketBooking(details[0],details[1],Integer.parseInt(details[2]));
		System.out.println("Payment mode\r\n" + 
				"1.Cash payment\r\n" + 
				"2.Wallet payment\r\n" + 
				"3.Credit card payment");
		Integer choice = Integer.parseInt(sc.nextLine());
		if(choice == 1) {
			System.out.println("Enter the amount");
			Double amount = Double.parseDouble(sc.nextLine());
			ticketBooking.makePayment(amount);
		}
		if(choice == 2) {
			System.out.println("Enter the amount");
			Double amount = Double.parseDouble(sc.nextLine());
			System.out.println("Enter the wallet number");
			String wallet = sc.nextLine();
			ticketBooking.makePayment(wallet, amount);
		}
		if(choice == 3) {
			System.out.println("Enter card holder name");
			String holderName = sc.nextLine();
			System.out.println("Enter the amount");
			Double amount = Double.parseDouble(sc.nextLine());
			System.out.println("Enter the credit card type");
			String credit = sc.nextLine();
			System.out.println("Enter the CCV number");
			String ccv = sc.nextLine();
			ticketBooking.makePayment(credit, ccv, holderName, amount);
		}
		sc.close();

	}

}
