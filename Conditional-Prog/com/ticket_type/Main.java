package com.ticket_type;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age >= 15)
			System.out.println("Adult Ticket");
		else
			System.out.println("Child Ticket");
		sc.close();

	}

}
