package com.type_of_constructors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the stall category:");
		String name = br.readLine();
		System.out.println("Enter the details of the stall category:");
		String detail = br.readLine();
		StallCategory stallCategoryInsForDefaultConst = new StallCategory();
		stallCategoryInsForDefaultConst.setName(name);
		stallCategoryInsForDefaultConst.setDetail(detail);
		System.out.println("Using Default Constructor");
		stallCategoryInsForDefaultConst.display();
		StallCategory stallCategoryInsForParamConst = new StallCategory(name, detail);
		System.out.println("Using Parameterised Constructor");
		stallCategoryInsForParamConst.display();
		
		br.close();
	}

}
