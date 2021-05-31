package com.minimum_and_maximum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstValue = sc.nextInt();
		int secondValue = sc.nextInt();
		if(firstValue > secondValue)
			System.out.print(firstValue+" "+(firstValue+secondValue));
		else
			System.out.println(secondValue+" "+(firstValue+secondValue));
		sc.close();

	}

}
