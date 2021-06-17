package com.one_to_many_remove_user;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<User> userList = new ArrayList<>();
		User user = new User();
		System.out.println("Enter the number of users:");
		Integer noOfUser = Integer.parseInt(br.readLine());
		System.out.println("Enter the user details in comma separated(Name,Contact Number)");
		for(int i=0;i<noOfUser;i++) {
			String userThings[] = br.readLine().split(",");
			user = new User(userThings[0],userThings[1]);
			userList.add(user);
		}
		
		System.out.println("Enter the number of halls:");
		Integer noOfHalls = Integer.parseInt(br.readLine());
		System.out.println("Enter the hall details in comma separated(Name,Cost per day,Owner Name)");
		for(int i=0;i<noOfHalls;i++) {
			String hallThings[] = br.readLine().split(",");
			Hall hall = new Hall(hallThings[0], Integer.parseInt(hallThings[1]), hallThings[2]);
			user.addToHallList(hall);
		}
		
		List<Hall> hallList = user.getHallList();
		System.out.println("Enter the username to be deleted:");
		String delete = br.readLine();
		
		for(User i : userList) {
			if(i.getName().equals(delete)) {
				userList.remove(i);
				for(Hall j : hallList) {
					if(j.getOwnerName().equals(delete)) {
						hallList.remove(j);
						break;
					}
				}
				break;
			}
		}
			
		int hallFlag = 0, index =1, userFlag = 0;
		for(User i : userList) {
			userFlag = 0;
			if(i != null) {
				userFlag = 1;
				System.out.println("Owner Name:"+i.getName());
				hallFlag = 0;
				for(Hall j : hallList) {
					if(j != null) {
						if(i.getName().equals(j.getOwnerName())) {
							hallFlag = 1;
							System.out.println("Hall "+index+++"\r\n" + 
									"Name:"+j.getName()+"\r\n" + 
									"Cost per day:"+j.getCostPerDay()+"\r\n" + 
									"Owner Name:"+j.getOwnerName()+"");
						}
						
					}
				}
				if(hallFlag ==0) {
					System.out.println("No halls are available");
				}
			}
			
		}
		if(userFlag == 0) {
			System.out.println("No user are there");
		}
		br.close();

	}

}
