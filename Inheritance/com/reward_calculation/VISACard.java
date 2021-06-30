package com.reward_calculation;

public class VISACard {
	private String holderName;	
	private String ccv;
	public VISACard() {}
	public VISACard(String holderName, String ccv) {
		this.holderName = holderName;
		this.ccv = ccv;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getCcv() {
		return ccv;
	}
	public void setCcv(String ccv) {
		this.ccv = ccv;
	}
	public Double computeRewardPoints(String purchaseType, Double amount) {
		return amount*0.01;
	}
	
}
