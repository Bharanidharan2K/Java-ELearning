package com.reward_calculation;

public class HPVISACard extends VISACard {
	public HPVISACard() {}
	public HPVISACard(String name, String ccv) {
		super(name, ccv);
	}
	public Double computeRewardPoints(String purchaseType, Double amount) {
		if(purchaseType == "Fuel") {
			return 0.01+10.0*amount;
		}
		return super.computeRewardPoints(purchaseType, amount);
	}
}
