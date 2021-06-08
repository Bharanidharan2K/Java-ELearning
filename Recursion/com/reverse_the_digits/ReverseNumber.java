package com.reverse_the_digits;

public class ReverseNumber {
	static int result = 0, power = 1;
	public int reverse(int n) {
		if(n == 0)
			return 1;
		else if(n!=0) {
			reverse(n/10);
			result += (n % 10) * power;
			power *= 10;
		}
		return result;
	}
}
