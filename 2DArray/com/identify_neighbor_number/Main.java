package com.identify_neighbor_number;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		int count = 0;
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j] = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				count = 0;
				if(a[i][j] == 20) {
					if((i-1) >= 0 && a[i-1][j]<=10 && a[i-1][j]!=0) {
						count++;
					}
					if((i+1) <n && a[i+1][j]<=10 && a[i+1][j]!=0) {
						count++;
					}
					if((j-1) >=0 && a[i][j-1]<=10 && a[i][j-1]!=0) {
						count++;
					}
					if((j+1) <n && a[i][j+1]<=10 && a[i][j+1]!=0) {
						count++;
					}
					if(count == 2) {
						a[i][j] = 0;
					}
				}
			}
			
		}
		for(int []k : a) {
			for(int i : k) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
