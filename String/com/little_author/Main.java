package com.little_author;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int sameCharcterCount = 0;
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i) == s.charAt(j)) 
					if(i != j) 
						sameCharcterCount ++;
			}
		}
		if(sameCharcterCount - (s.length()-sameCharcterCount) == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();

	}

}
