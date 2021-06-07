package com.addition_challenge;

public class AdditionChallenge {
	int findSum(int n) {
		int sum = 1;
		if(n == 0)
			return 1;
		else {
			for(int i=1;i<=n;i++) {
				sum += Math.pow(2, i);
			}
			return sum;
		}
		
	}
}
