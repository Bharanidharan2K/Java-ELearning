package com.high_school_topcoder;

public class Fibonacci {
	int fiboLastDigit(int n) {
		long firstVal = 0, secondVal = 1, sum = 0;
		for(int i=0;i<=n-2;i++) {
			sum = firstVal + secondVal;
			firstVal = secondVal;
			secondVal = sum;
		}
		sum = sum % 10;
		int lastDigitOf_nth_Value = (int) sum;
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else
			return lastDigitOf_nth_Value;
	}
}
