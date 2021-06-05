package com.best_programmer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		NumberType numberTypeIns = new NumberType();
		int returnedValue = numberTypeIns.findType(n);
		if(returnedValue == 1) {
			System.out.println(n+" is a deficient number");
		}
		else if(returnedValue == -1) {
			System.out.println(n+" is an abundant number");
		}
		else {
			System.out.println(n+" is a perfect number");
		}
		sc.close();
	}
	
}
