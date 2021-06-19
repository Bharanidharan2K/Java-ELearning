package com.event_and_ticket_booking_2;

import java.util.Date;

public class TicketBooking {
	private Event event;	
	private java.util.Date bookingTime;	
	private User customer;
	private Double price;
	
	public TicketBooking() {}
	public TicketBooking(Event event, Date bookingTime, User customer, Double price) {
		this.event = event;
		this.bookingTime = bookingTime;
		this.customer = customer;
		this.price = price;
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	public java.util.Date getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(java.util.Date bookingTime) {
		this.bookingTime = bookingTime;
	}
	public User getCustomer() {
		return customer;
	}
	public void setCustomer(User customer) {
		this.customer = customer;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
