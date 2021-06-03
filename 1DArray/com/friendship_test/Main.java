package com.friendship_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[50];
		int equalCount = 0, differentCount = 0;
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		for(int i=0;i<n;i++) {
			equalCount = 0;
			for(int j=i+1;j<n;j++) {
				if(a[i] == a[j])
					equalCount++;
			}
			if(equalCount == 0)
				differentCount++;
		}
		System.out.println(differentCount);
		sc.close();
	}

}
