package com.overriding_simple;

public class StageEvent extends Event{
	private Integer noOfShows;	
	private Integer noOfSeatsPerShow;
	public StageEvent() {}
	public StageEvent(Integer noOfShows, Integer noOfSeatsPerShow) {
		this.noOfShows = noOfShows;
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}
	public Integer getNoOfShows() {
		return noOfShows;
	}
	public void setNoOfShows(Integer noOfShows) {
		this.noOfShows = noOfShows;
	}
	public Integer getNoOfSeatsPerShow() {
		return noOfSeatsPerShow;
	}
	public void setNoOfSeatsPerShow(Integer noOfSeatsPerShow) {
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}
	public Double projectedRevenue() {
		return this.getNoOfShows()*this.getNoOfSeatsPerShow()*50.0;
	}
	
}
