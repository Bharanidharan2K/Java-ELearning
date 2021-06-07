package com.right_triangle_of_dots;

public class Dots {
	public int find(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum += i;
			if(n == sum)
				return 1;
			
		}
		return 0; 
	}
}
