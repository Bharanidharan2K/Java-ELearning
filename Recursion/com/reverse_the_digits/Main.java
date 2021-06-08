package com.reverse_the_digits;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ReverseNumber reverseNumberIns = new ReverseNumber();
		System.out.println(reverseNumberIns.reverse(n));
		sc.close();

	}

}
