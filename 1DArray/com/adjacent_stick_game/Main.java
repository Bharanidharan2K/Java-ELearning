package com.adjacent_stick_game;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[50];
		int maximum = 0;
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		for(int i=0;i<n;i+=2) {
			if(arr[i]<arr[i+1])
				maximum += arr[i];
			else
				maximum += arr[i+1];
		}
		System.out.println(maximum);
		sc.close();
	}

}
