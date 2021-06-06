package com.best_mobile_plan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int eve = sc.nextInt();
		int nyt = sc.nextInt();
		BestMobilePlan bestMobilePlanIns = new BestMobilePlan();
		bestMobilePlanIns.printPlanDetails(day, eve, nyt);
		sc.close();
	}

}
