package com.arithmetic_exception;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cost of the item for n days");
		Integer cost = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the value of n");
		Integer value = sc.nextInt();
		try {
			System.out.println("Cost per day of the item is "+cost/value);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		sc.close();

	}

}
