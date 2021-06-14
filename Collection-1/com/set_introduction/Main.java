package com.set_introduction;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> set = new HashSet<>();
		char check;
		do {
			System.out.println("Enter the username");
			String name = br.readLine();
			System.out.println("Do you want to continue?(Y/N)");
			set.add(name);
			check = br.readLine().charAt(0);
			check = Character.toLowerCase(check);
		} while(check != 'n');
		System.out.println("The unique number of usernames is "+set.size());
		
		br.close();
	}

}
