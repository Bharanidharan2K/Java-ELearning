package com.event_and_hall_booking;

import java.util.Date;

public class HallBooking {
	Hall hall;	
	Event event;	
	java.util.Date startDate;	
	java.util.Date endDate;	
	Double price;
	
	public HallBooking() {}
	public HallBooking(Hall hall, Event event, Date startDate, Date endDate, Double price) {
		this.hall = hall;
		this.event = event;
		this.startDate = startDate;
		this.endDate = endDate;
		this.price = price;
	}
	public Hall getHall() {
		return hall;
	}
	public void setHall(Hall hall) {
		this.hall = hall;
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	public java.util.Date getStartDate() {
		return startDate;
	}
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}
	public java.util.Date getEndDate() {
		return endDate;
	}
	public void setEndDate(java.util.Date endDate) {
		this.endDate = endDate;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
