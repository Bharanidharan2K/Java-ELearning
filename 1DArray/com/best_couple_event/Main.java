package com.best_couple_event;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int count = 0;
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		for(int i=1;i<=n;i++) {
			count = 0;
			for(int j=0;j<n;j++) {
				if(i == a[j])
					count++;
			}
			if(count%2 !=0)
				System.out.println(i);
		}
		sc.close();

	}

}
