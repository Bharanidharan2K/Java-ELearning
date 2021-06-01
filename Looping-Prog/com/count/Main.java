package com.count;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int evenCount = 0,oddCount = 0;
		for(int i=0;i<n;i++) {
			int input = sc.nextInt();
			if(input%2==0) {
				evenCount++;
			}
			else
				oddCount++;
		}
		System.out.println(evenCount+ " "+ oddCount);
		sc.close();

	}

}
