package com.highest_valued_number;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int a[][] = new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j] = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i][j] != 20)
					if(a[i][j] <= 10)
						if(max < a[i][j])
							max = a[i][j];
			}
		}
		System.out.println(max);
		sc.close();

	}

}
