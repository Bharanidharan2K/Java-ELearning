package com.candy_game;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int remainder, count = 0;
		while(n>0) {
			remainder = n%10;
			n = n/10;
			if(remainder == 4)
				count++;
		}
		System.out.println(count);
		sc.close();
	}

}
