package com.reward_calculation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String check = "";
		do {
			System.out.println("Enter the holder name");
			String name = sc.nextLine();
			System.out.println("Enter the CCV number");
			String ccv = sc.nextLine();
			System.out.println("Enter the bill amount");
			Double amount = Double.parseDouble(sc.nextLine());
			System.out.println("Mention the type of spending");
			String type = sc.nextLine();
			System.out.println("Choose card type\r\n" + 
					"1.VISA card\r\n" + 
					"2.HP VISA card");
			Integer choice = Integer.parseInt(sc.nextLine());
			if(choice == 1) {
				VISACard visaCard = new VISACard(name, ccv);
				System.out.println("Holder name:"+visaCard.getHolderName()+"\r\n" + 
						"CCV:"+visaCard.getCcv()+"\r\n" + 
						"Reward points:"+visaCard.computeRewardPoints(type, amount));
				
			}
			else if(choice == 2) {
				HPVISACard hpvisaCard = new HPVISACard(name, ccv);
				System.out.println("Holder name:"+hpvisaCard.getHolderName()+"\r\n" + 
						"CCV:"+hpvisaCard.getCcv()+"\r\n" + 
						"Reward points:"+hpvisaCard.computeRewardPoints(type, amount));
				
			}
			else {
				System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue?(Y/N)");
			check = sc.nextLine();
		}while(check.equals("Y"));
		sc.close();

	}

}
