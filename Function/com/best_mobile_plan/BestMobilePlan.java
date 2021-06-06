package com.best_mobile_plan;

public class BestMobilePlan {
	void printPlanDetails(int day,int eve,int nyt) {
		float planA = 0F,planB = 0F;
		if(day<100)
			planA = eve*0.15F + nyt*20F; 
		else
			planA = (day-100)*0.25F + eve*0.15F + nyt*0.20F;
		if(day<250)
		    planB=eve*0.35F+nyt*0.25F;
	    else
		    planB=(day-250)*0.45F+eve*0.35F+nyt*0.25F;
		String af=String.format("%.2f",planA);
	    String bf=String.format("%.2f",planB);
	    planA = Float.parseFloat(af);
	    planB = Float.parseFloat(bf);
	    System.out.println("Plan A costs "+af);
	    System.out.println("Plan B costs "+bf);
		
		if(planA == planB)
			System.out.println("Plan A and B are the same price");
		else if(planB>planA)
			System.out.println("Plan A is cheapest");
		else 
			System.out.println("Plan B is cheapest");
		
	}
}
