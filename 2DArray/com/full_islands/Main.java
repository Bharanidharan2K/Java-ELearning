package com.full_islands;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j] = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i][j]==1) {
					if((i-1)>=0)
						a[i-1][j] = 0;
					if((i+1)<n)
						a[i+1][j] = 0;
					if((j-1)>=0)
						a[i][j-1] = 0;
					if((j+1)<n)
						a[i][j+1] = 0;
				}
			}
		}
		System.out.println();
		for(int k[] : a) {
			for(int l : k) {
				System.out.print(l+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
