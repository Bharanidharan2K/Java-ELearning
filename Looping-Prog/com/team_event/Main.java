package com.team_event;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int lastDigit = number%10;
		if(number>9) {
			while(number>=10) {
				number/=10;
			}
			System.out.println(Math.abs(lastDigit - number));
		}
		else
			System.out.println("Invalid Input");
		sc.close();
	}

}
