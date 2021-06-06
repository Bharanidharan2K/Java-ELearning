package com.winter_challenge;

public class ModInverse {
	public int findValue(int x,int m) {
		int n = -1;
		for(int i=1;i<=m;i++) {
			if((x*i)%m == 1) {
				return i;
			}
		}
		return n; 
	}
}
