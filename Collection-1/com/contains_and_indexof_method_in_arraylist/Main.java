package com.contains_and_indexof_method_in_arraylist;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> list = new ArrayList<>();
		Integer indexValue;
		System.out.println("Enter the number of halls:");
		Integer n = Integer.parseInt(br.readLine());
		for(int i=0,index = 1;i<n;i++) {
			System.out.println("Enter the Hall Name "+index++);
			String name = br.readLine();
			list.add(name);
		}
		System.out.println("Enter the hall name to be searched:");
		String search = br.readLine();
		if(list.contains(search)) {
			indexValue = list.indexOf(search);
			System.out.println(search+" hall is found in the list at position "+indexValue);
		} 
		else 
			System.out.println(search+" hall is not found");
		br.close();
	}

}
