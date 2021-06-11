package com.caption_content;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int maxDifference = 0, minDifference = 0;
		for(int i=0;i<s1.length();i++) {
			if( (s1.charAt(i) != s2.charAt(i)) || 
				(s1.charAt(i) == '?' && s2.charAt(i) == '?' ) )
				maxDifference ++;
			if( (s1.charAt(i) != s2.charAt(i)) ) 
				if(s1.charAt(i) == '?' || s2.charAt(i) == '?' )
					minDifference ++;
				
		}
		System.out.println(minDifference +" "+ maxDifference);
		sc.close();

	}

}
