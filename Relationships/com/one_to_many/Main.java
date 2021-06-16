package com.one_to_many;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of users:");
		ArrayList<User> userList = new ArrayList<>();
		Integer noOfUser = Integer.parseInt(br.readLine());
		for(int i=0,index = 1;i<noOfUser;i++) {
			System.out.println("User "+index++);
			System.out.println("Name:");
			String name = br.readLine();
			System.out.println("contact number:");
			String contactNumber = br.readLine();
			User user = new User(name, contactNumber);
			userList.add(user);
		}
		User user = new User();
		System.out.println("Enter the number of halls:");
		Integer noOfhall = Integer.parseInt(br.readLine());
		for(int i=0, index = 1;i<noOfhall;i++) {
			System.out.println("Hall "+index++);
			System.out.println("Name:");
			String name = br.readLine();
			System.out.println("Cost per day:");
			Integer costPerDay = Integer.parseInt(br.readLine());
			System.out.println("Owner Name:");
			String ownerName = br.readLine();
			Hall hall = new Hall(name, costPerDay, ownerName);
			user.addToHallList(hall);
		}
		
		List<Hall> hallList =  user.getHallList();
		int flag = 0,index = 1;
		for(User i : userList) {
			flag = 0;
			System.out.println("Owner Name : "+i.getName());
			for(Hall j : hallList) {
				if(i.getName().equals(j.getOwnerName())) {
					flag = 1;
					System.out.println("Hall "+index++);
					System.out.println("Name:"+j.getName()+"\r\n" + 
							"Cost per day:"+j.getCostPerDay());
				}
			}
			if(flag == 0)
				System.out.println("No halls are available");
			
		}
		
		br.close();

	}

}
