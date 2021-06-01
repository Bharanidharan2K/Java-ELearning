package com.lucky_pairs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2!=0)
				a = a*2;
			else
				b = b*2;
		}
		System.out.println(a+b);
		sc.close();

	}

}
