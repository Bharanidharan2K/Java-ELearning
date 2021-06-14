package com.user_entry;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> set = new HashSet<>();
		String check ="";
		do {
			System.out.println("Enter Username");
			String name = br.readLine();
			set.add(name);
			System.out.println("Do you want to continue ?(yes/no)");
			check = br.readLine();
		} while(!check.equals("no"));
		System.out.println("Number of Users = "+set.size());
		br.close();
	}

}
