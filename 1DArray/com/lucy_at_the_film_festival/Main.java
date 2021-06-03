package com.lucy_at_the_film_festival;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int length[] = new int[n];
		int rating[] = new int[n];
		int combined[] = new int[n];
		for(int i=0;i<n;i++)
			length[i] = sc.nextInt();
		for(int i=0;i<n;i++)
			rating[i] = sc.nextInt();
		for(int i=0;i<n;i++)
			combined[i] = length[i] * rating[i];
		int consider = combined[0];
		int index = 0;
		for(int i=0;i<n;i++) {
			if(combined[i]>consider) {
				consider = combined[i];
				index = i;
			}
			else if(combined[i] == consider) {
				if(rating[i]>rating[index]) {
					index = i;
				}
			}
		}
		System.out.println(index+1);
		sc.close();

	}

}
