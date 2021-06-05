package com.nice_number;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		NiceNumber niceNumberIns = new NiceNumber();
		int returnedValue = niceNumberIns.findType(n);
		if(returnedValue == 1)
			System.out.println("Nice");
		else
			System.out.println("Not Nice");
		sc.close();

	}

}
