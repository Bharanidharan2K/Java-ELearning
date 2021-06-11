package com.nellas_birthday_and_colorfull_balloons;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int amberColorCount = 0,brassColorCount = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == 'a')
				amberColorCount ++;
			else
				brassColorCount ++;
		}
		if(amberColorCount > brassColorCount)
			System.out.println(brassColorCount);
		else
			System.out.println(amberColorCount);
		sc.close();
	}

}
