package com.casper_at_the_carnival;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),i ;
		String s[] = new String[50];
		for(i=0; i<n; i++) 
			s[i] = sc.next();
		for(i=0; i<n-1; i++) {
			if(s[i].equals("cookie") && s[i+1].equals("cookie"))
				break;
		}
		if(i < n-1 || s[n-1] == "cookie")
			System.out.println("No");
		else
			System.out.println("Yes");
		sc.close();
		

	}

}
