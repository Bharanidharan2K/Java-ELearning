package com.string_split;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the details of the Item type:");
		String things[] = br.readLine().split(",");
		ItemType itemType = new ItemType(things[0], Double.parseDouble(things[1]), Double.parseDouble(things[2]));
		itemType.display();
		br.close();

	}

}
