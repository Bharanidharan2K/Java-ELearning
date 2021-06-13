package com.hall_equality;

import java.util.Date;

public class Hall {
	private String name;
	private Long contactNumber;
	private Double costPerDay;
	private String ownerName;
	private Date bookingDate;
	public Hall() {
		super();
	}
	public Hall(String name, Long contactNumber, Double costPerDay, String ownerName, Date bookingDate) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.costPerDay = costPerDay;
		this.ownerName = ownerName;
		this.bookingDate = bookingDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public boolean equals(Hall hall) {
		if(this.getName().equals(hall.getName()) &&
			this.getContactNumber().equals(hall.getContactNumber()) &&
			this.getCostPerDay().equals(hall.getCostPerDay()) &&
			this.getOwnerName().equals(hall.getOwnerName()) &&
			this.getBookingDate().equals(hall.getBookingDate())) {
			
			return true;
		}
		else {
			return false;
		}
			
	}
}
