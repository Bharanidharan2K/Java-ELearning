package com.nice_number;

public class NiceNumber {
	int findType(int n) {
		int count = 0;
		for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				count++;
			}
		}
		if(count == 4)
			return 1;
		else
			return 0;
	}
}
