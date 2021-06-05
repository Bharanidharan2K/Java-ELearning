package com.best_programmer;

public class NumberType {
	int findType(int n) {
		int sum = 0;
		for(int i = 1;i < n;i ++) {
			if(n%i == 0)
				sum+=i;
		}
		if(sum == n) {
			return 0;
		}
		else if(sum < n) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
