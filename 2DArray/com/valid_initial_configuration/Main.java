package com.valid_initial_configuration;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0; 
		int a[][] = new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j] = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i][j] == 20 || a[i][j]<=10)
				{}
				else
					count++;
			}
		}
		if(count !=0) 
			System.out.println("No");
		else
			System.out.println("Yes");
		sc.close();

	}

}
