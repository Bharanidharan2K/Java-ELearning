package com.manipulation_in_arraylist;

import java.util.ArrayList;
import java.util.List;

public class HallBO {
	public List<Hall> getHallList(){
		List<Hall> hallList=new ArrayList<>();
		hallList.add(new Hall("SPK hall","12345",Double.parseDouble("10000"),"John"));
		hallList.add(new Hall("DRG hall","67890",Double.parseDouble("15000"),"Joe"));
		hallList.add(new Hall("EFG hall","45678",Double.parseDouble("20000"),"Jack"));
		return hallList;
	}
	public void displayAll(List<Hall> halllist) {
		for(Hall i : halllist)
			System.out.printf("%-20s%-20s%-20s%-20s\n",i.getName(),i.getContactNumber(),i.getCostPerDay(),i.getOwnerName());
		
	}
}
