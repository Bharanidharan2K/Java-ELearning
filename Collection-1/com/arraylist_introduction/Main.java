package com.arraylist_introduction;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char check;
		Integer i = 1;
		List<String> list = new ArrayList<>();
		do {
			System.out.println("Enter the username "+i++);
			String name = br.readLine();
			list.add(name);
			System.out.println("Do you want to continue?(y/n)");
			check = br.readLine().charAt(0);
		} while(check!='n');
		System.out.println("The Names entered are:");
		for(String itr : list)
			System.out.println(itr);
		br.close();
	}

}
