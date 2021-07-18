package com.interfaces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose Stall Type\r\n" + 
				"1)Gold Stall\r\n" + 
				"2)Premium Stall\r\n" + 
				"3)Executive Stall");
		Integer choice = Integer.parseInt(br.readLine());
		if(choice == 1) {
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
			String things[] = br.readLine().split(",");
			GoldStall goldStall = new GoldStall(things[0], Integer.parseInt(things[1]), things[2], Integer.parseInt(things[3]));
			goldStall.display();
		}
		else if(choice == 2) {
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
			String things[] = br.readLine().split(",");
			PremiumStall premiumStall = new PremiumStall(things[0], Integer.parseInt(things[1]), things[2], Integer.parseInt(things[3]));
			premiumStall.display();
		}
		else if(choice == 3) {
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
			String things[] = br.readLine().split(",");
			ExecutiveStall executiveStall = new ExecutiveStall(things[0], Integer.parseInt(things[1]), things[2], Integer.parseInt(things[3]));
			executiveStall.display();
		}
		else {
			System.out.println("Invalid Stall Type");
		}
		br.close();

	}

}
