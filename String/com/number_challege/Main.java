package com.number_challege;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		char a[] = new char[50];
		for(int i=0;i<s.length();i++) {
			a[i] = s.charAt(i);
		}
		for(int i=0;a[i]!='\0';i++) {
			if(a[i] == '1')
				count += 1;
		}
		if(count == s.length() -1)
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
	}

}
