package com.welcome_party;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[50];
		int n = sc.nextInt();
		int redCount = 0,greenCount = 0,blueCount = 0;
		for(int i =0; i <n; i ++)
			a[i] = sc.nextInt();
		for(int i =0; i <n; i ++) {
			if(a[i] == 1)
				redCount++;
			else if(a[i] == 2)
				greenCount++;
			else
				blueCount++;
		}
		if(redCount>greenCount && redCount>blueCount)
			System.out.println(greenCount+blueCount);
		else if(greenCount>redCount && greenCount>blueCount)
			System.out.println(redCount+blueCount);
		else
			System.out.println(greenCount+redCount);
		sc.close();
	}
}
