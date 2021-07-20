package com.export_booking_details;

import java.util.Date;

public class TicketBooking {
	private String customer;	
	private Double price;
	private java.util.Date bookingTime;	
	private String stageEventShow;
	public TicketBooking() {}
	public TicketBooking(String customer, Double price, Date bookingTime, String stageEventShow) {
		this.customer = customer;
		this.price = price;
		this.bookingTime = bookingTime;
		this.stageEventShow = stageEventShow;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public java.util.Date getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(java.util.Date bookingTime) {
		this.bookingTime = bookingTime;
	}
	public String getStageEventShow() {
		return stageEventShow;
	}
	public void setStageEventShow(String stageEventShow) {
		this.stageEventShow = stageEventShow;
	}
}
