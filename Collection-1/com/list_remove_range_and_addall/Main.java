package com.list_remove_range_and_addall;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		UserBO userBo = new UserBO();
		UserBO userList = UserBO.getList();
		System.out.println("Enter the number of User details to be added");
		int n = Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the user "+i+" detail in csv format");
			String things[] = br.readLine().split(",");
			User user = new User(things[0], things[1], things[2], things[3]);
			userBo.add(user);
			
		}
		userList.addAll(userBo);
		User u = new User();
		u.display(userList);
		System.out.println("Enter the range to be removed from array list");
		int startPoint = Integer.parseInt(br.readLine());
		int endPoint = Integer.parseInt(br.readLine());
		userList.removeUser(startPoint, endPoint);
		u.display(userList);
		br.close();
	}

}
