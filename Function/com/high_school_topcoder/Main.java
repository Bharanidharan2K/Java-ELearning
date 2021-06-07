package com.high_school_topcoder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Fibonacci fibonacciIns = new Fibonacci();
		System.out.println(fibonacciIns.fiboLastDigit(n));
		sc.close();

	}

}
