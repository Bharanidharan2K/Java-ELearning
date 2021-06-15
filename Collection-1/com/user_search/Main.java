package com.user_search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<User> set = new HashSet<>();
		System.out.println("Enter number of users:");
		Integer n = Integer.parseInt(br.readLine());
		for(int i = 0,index = 1;i<n;i++) {
			System.out.println("Enter details of user"+index++);
			System.out.println("Username:");
			String username = br.readLine();
			System.out.println("Bank name:");
			String bankname = br.readLine();
			User user = new User(username, bankname);
			set.add(user);
		}
		ArrayList<User> list1 = new ArrayList<>(set);
		ArrayList<User> list2 = new ArrayList<>();
		Collections.sort(list1);
		System.out.println("Enter username(Expire in one month) seperated by comma");
		String things[] = br.readLine().split(",");
		System.out.println("Users going to expire within a month");
		for(String i : things) {
			User u = new User(i, null);
			list2.add(u);
		}
		int index = 1;
		for(User i : list1) {
			for(User j : list2) {
				if(i.equals(j)) {
					System.out.println("User "+index++);
					System.out.println("User Name ="+i.getUsername());
					System.out.println("Bank Name ="+i.getBankname());
				}
			}
		}
		br.close();

	}

}
