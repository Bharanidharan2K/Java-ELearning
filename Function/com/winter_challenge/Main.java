package com.winter_challenge;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int m = sc.nextInt();
		ModInverse modInverseIns = new ModInverse();
		int result = modInverseIns.findValue(x, m);
		System.out.println(result);
		sc.close();

	}

}
