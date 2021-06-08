package com.art_competition;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		EnrollNumbers enrollNumberIns = new EnrollNumbers();
		enrollNumberIns.printNumbers(n);
		sc.close();

	}

}
