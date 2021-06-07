package com.right_triangle_of_dots;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Dots dotsIns = new Dots();
		if(dotsIns.find(n) == 1)
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();

	}

}
