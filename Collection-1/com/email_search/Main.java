package com.email_search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		String check = "";
		do {
			System.out.println("Enter Email address");
			String email = br.readLine();
			set1.add(email);
			System.out.println("Do you want to Continue?(yes/no)");
			check = br.readLine();
		} while(!check.equals("no"));
		System.out.println("Enter the email addresses to be searched separated by comma");
		
		String serachEmail[] = br.readLine().split(",");
		for(String i : serachEmail)
			set2.add(i);
		if(set1.containsAll(set2))
			System.out.println("Email addresses are present");
		else
			System.out.println("Email addresses are not present");
		
		br.close();

	}

}
