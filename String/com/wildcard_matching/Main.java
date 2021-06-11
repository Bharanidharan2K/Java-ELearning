package com.wildcard_matching;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int count = 0;
		for(int i=0;i<s1.length();i++) {
			if((s1.charAt(i) == s2.charAt(i)) || 
				s1.charAt(i) == '?' ||
				s2.charAt(i) == '?')
				count += 1;
		}
		if(count == s1.length()) 
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
	}

}
