package com.overloading_make_payment;

public class TicketBooking {
	private String stageEvent;
	private String customer;	
	private Integer noOfSeats;
	
	public TicketBooking() {}
	public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
		this.stageEvent = stageEvent;
		this.customer = customer;
		this.noOfSeats = noOfSeats;
	}
	public String getStageEvent() {
		return stageEvent;
	}
	public void setStageEvent(String stageEvent) {
		this.stageEvent = stageEvent;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public Integer getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public void makePayment(Double amount) {
		System.out.println("Stage event:"+this.getStageEvent()+"\r\n" + 
				"Customer:"+this.getCustomer()+"\r\n" + 
				"Number of seats:"+this.getNoOfSeats()+"\r\n" + 
				"Amount "+amount+" paid in cash");
	}
	public void makePayment(String walletNumber ,Double amount) {
		System.out.println("Stage event:"+this.getStageEvent()+"\r\n" + 
				"Customer:"+this.getCustomer()+"\r\n" + 
				"Number of seats:"+this.getNoOfSeats()+"\r\n" + 
				"Amount "+amount+" paid using wallet number "+walletNumber);
	}
	public void makePayment(String creditCard,String ccv,String name,Double amount) {
		System.out.println("Stage event:"+this.getStageEvent()+"\r\n" + 
				"Customer:"+this.getCustomer()+"\r\n" + 
				"Number of seats:"+this.getNoOfSeats()+"\r\n" + 
				"Holder name:"+name+"\r\n" + 
				"Amount "+amount+" paid using "+creditCard+" card\r\n" + 
				"CCV:"+ccv);
	}
}
