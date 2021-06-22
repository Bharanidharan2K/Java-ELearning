package com.multilevel_inheritance;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose Stall Type\r\n" + 
				"1.Silver Stall\r\n" + 
				"2.Gold Stall\r\n" + 
				"3.Platinum Stall");
		Integer choice = Integer.parseInt(br.readLine());
		switch(choice) {
		case 1:
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost)");
			String silverStallDetails[] = br.readLine().split(",");
			SilverStall silverStall = new SilverStall(silverStallDetails[0],silverStallDetails[1],silverStallDetails[2],Integer.parseInt(silverStallDetails[3]));
			System.out.println("Stall Name:"+silverStall.getName()+"\r\n" + 
					"Details:"+silverStall.getDetail()+"\r\n" + 
					"Owner Name:"+silverStall.getOwner()+"\r\n" + 
					"Total Cost:"+silverStall.getCost());
			break;
		case 2:
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set)");
			String goldStallDetails[] = br.readLine().split(",");
			GoldStall goldStall = new GoldStall(goldStallDetails[0], goldStallDetails[1], goldStallDetails[2], Integer.parseInt(goldStallDetails[3]), Integer.parseInt(goldStallDetails[4]));
			System.out.println("Stall Name:"+goldStall.getName()+"\r\n" + 
					"Details:"+goldStall.getDetail()+"\r\n" + 
					"Owner Name:"+goldStall.getOwner()+"\r\n" + 
					"TV Sets:"+goldStall.getTvSet()+"\r\n" + 
					"Total Cost:"+((goldStall.getTvSet()*100)+goldStall.getCost()));
			break;
		case 3:
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set,Number of Projectors)");
			String platinumStallDetails[] = br.readLine().split(",");
			PlatinumStall platinumStall = new PlatinumStall(platinumStallDetails[0], platinumStallDetails[1], platinumStallDetails[2], Integer.parseInt(platinumStallDetails[3]), Integer.parseInt(platinumStallDetails[4]), Integer.parseInt(platinumStallDetails[5]));
			System.out.println("Stall Name:"+platinumStall.getName()+"\r\n" + 
					"Details:"+platinumStall.getDetail()+"\r\n" + 
					"Owner Name:"+platinumStall.getOwner()+"\r\n" + 
					"TV Sets:"+platinumStall.getTvSet()+"\r\n" + 
					"Projectors:"+platinumStall.getProjector()+"\r\n" + 
					"Total Cost:"+(platinumStall.getCost()+platinumStall.getTvSet()*100+platinumStall.getProjector()*500));
			break;
		
		}
		br.close();
	}
}
