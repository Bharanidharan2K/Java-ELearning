package com.hazecraft_client_series;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,x = 2;
		while(n!=0) {
			for(i=2;i<x;i++) {
				if(x%i == 0)
					break;
			}
			if(i==x) {
				System.out.print(x+" ");
				n--;
			}
			x++;
		}
		sc.close();
	}

}
