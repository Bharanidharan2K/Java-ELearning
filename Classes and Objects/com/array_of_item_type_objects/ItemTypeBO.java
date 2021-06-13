package com.array_of_item_type_objects;

public class ItemTypeBO {
	public void add(ItemType object ,ItemType[] itemTypeArray,Integer index) {
		itemTypeArray[index] = object;
		System.out.println("New item added successfully");
	}
	public void search(String search, ItemType[] itemTypeArray) {
		for(ItemType i : itemTypeArray) {
			if(i == null) {
				System.out.println("Searched Item Type not found");
				break;
			}
			if(i.getName().equals(search)) {
				System.out.println("Searched Item Type is:");
				System.out.println("Name:"+i.getName());
				System.out.println("Deposit:"+i.getDeposit());
				System.out.println("Cost Per Day:"+i.getCostPerDay());
				break;
			}
		}
	}
	public void display(ItemType[] itemTypeArray) {
		for(int i=0, index =1;i<itemTypeArray.length;i++) {
			if(itemTypeArray[i] != null) {
				System.out.println("Item Type Number "+index+++":");
				System.out.println("Name:"+itemTypeArray[i].getName());
				System.out.println("Name:"+itemTypeArray[i].getDeposit());
				System.out.println("Name:"+itemTypeArray[i].getCostPerDay());
			}
		}
	}
}
