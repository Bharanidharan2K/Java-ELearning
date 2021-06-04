package com.number_of_white_cell;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		int sum = 0;
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j] = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i][j] != 20)
					if(a[i][j] <=10)
						sum += a[i][j];
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
