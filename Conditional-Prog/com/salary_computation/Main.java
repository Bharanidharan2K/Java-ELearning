package com.salary_computation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float HRA,DA;
		int salary = sc.nextInt();
		if(salary < 15000) {
			HRA = salary*0.15F;
			DA = salary*0.9F;
			System.out.printf("%.2f",(salary+HRA+DA));
		}
		else {
			HRA = 5000;
			DA = salary*0.98F;
			System.out.printf("%.2f",(salary+HRA+DA));
		}
		sc.close();
	}

}
