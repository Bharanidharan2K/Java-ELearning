package com.string_split;

public class ItemType {
	private String name;
	private Double deposit;	
	private Double costPerDay;
	
	public ItemType() {}
	public ItemType(String name, Double deposit, Double costPerDay) {
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getDeposit() {
		return deposit;
	}
	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	public Double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}
	public void display() {
		System.out.println("The entered item type is:");
		System.out.println("Name:"+this.getName()+"\r\n" + 
				"Deposit:"+this.getDeposit()+"\r\n" + 
				"Cost per day:"+this.getCostPerDay());
	}
}
