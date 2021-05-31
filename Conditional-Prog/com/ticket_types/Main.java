package com.ticket_types;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		switch(c) {
		case 'E':
		case 'e':
			System.out.println("Early Bird Ticket");
			break;
		case 'D':
		case 'd':
			System.out.println("Discount Ticket");
			break;
		case 'V':
		case 'v':
			System.out.println("VIP Ticket");
			break;
		case 'S':
		case 's':
			System.out.println("Standard Ticket");
			break;
		case 'C':
		case 'c':
			System.out.println("Child Ticket");
			break;
		}

	}

}
