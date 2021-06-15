package com.one_to_one_relationship_bi_directional;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Address> list = new ArrayList<>();
		int flag = 0;
		System.out.println("Enter the number of contact-address pair:");
		Integer n = Integer.parseInt(br.readLine());
		for(int i=0,index = 1;i<n;i++) {
			System.out.println("Enter the address "+index+":");
			String addressThings[] = br.readLine().split(",");
			System.out.println("Enter the contact "+index+++":");
			String contactThings[] = br.readLine().split(",");
			Address address = new Address
					(
							addressThings[0],addressThings[1],addressThings[2],
							addressThings[3],Integer.parseInt(addressThings[4])
					);
			Contact contact = new Contact
					(
							Integer.parseInt(contactThings[0]),Integer.parseInt(contactThings[1]),
							Integer.parseInt(contactThings[2]),contactThings[3]
					);
			
			contact.setAddress(address);
			address.setContact(contact);
			
			list.add(address);
		}
		System.out.println("Enter the mobile of the contact to be searched:");
		Integer search = Integer.parseInt(br.readLine());
		int index = 1;
		for(Address i : list) {
			Contact c = i.getContact();
			if(search.equals(c.getMobile()) ||
				search.equals(c.getAlternateMobile()) ||
				search.equals(c.getLandline())
				) {
				flag = 1;
				System.out.println("Contact-Address "+index++);
				System.out.println(i);
			}
		}
		if(flag == 0)
			System.out.println("No contact with mobile "+search+" found");
		br.close();

	}

}
