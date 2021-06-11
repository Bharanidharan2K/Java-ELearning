package com.balls_for_challenge;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		String y = sc.nextLine();
		String z = "";
		for(int i=0;i<x.length();i++) {
			if(x.charAt(i) == y.charAt(i) && x.charAt(i) == 'W')
				z += 'B';
			else if(x.charAt(i) == y.charAt(i) && x.charAt(i) == 'B')
				z += 'W';
			else
				z += 'B';
		}
		System.out.println(z);
		sc.close();

	}

}
