package com.abstract_event;

public class StageEvent extends Event {
	Integer noOfShows;	
	Double costPerShow;	
	public StageEvent(){}
	public StageEvent(String name, String detail, String type, String organiser, Integer noOfShow, Double costPerDay) {
		super(name, detail, type, organiser);
		this.noOfShows = noOfShow;
		this.costPerShow = costPerDay;
	}
	
	public Integer getNoOfShows() {
		return noOfShows;
	}
	public void setNoOfShows(Integer noOfShows) {
		this.noOfShows = noOfShows;
	}
	public Double getCostPerShow() {
		return costPerShow;
	}
	public void setCostPerShow(Double costPerShow) {
		this.costPerShow = costPerShow;
	}
	public Double calculateAmount() {
		return this.getCostPerShow()*this.getNoOfShows();
	}
}
