package com.area_of_shape;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the shape\r\n" + 
				"1.Circle\r\n" + 
				"2.Rectangle\r\n" + 
				"3.Triangle");
		Integer choice = Integer.parseInt(sc.nextLine());
		if(choice == 1) {
			System.out.println("Enter the radius:");
			Double radius = Double.parseDouble(sc.nextLine());
			Circle circle = new Circle(radius);
			circle.computeArea();
			System.out.printf("Area of circle is %.2f",circle.getArea());
		}
		if(choice == 2) {
			System.out.println("Enter the length and breadth:");
			Double length= Double.parseDouble(sc.nextLine());
			Double breadth = Double.parseDouble(sc.nextLine());
			Rectangle retangle = new Rectangle(length, breadth);
			retangle.computeArea();
			System.out.printf("Area of rectangle is %.2f",retangle.getArea());
		}
		if(choice == 3) {
			System.out.println("Enter the base and height:");
			Double base= Double.parseDouble(sc.nextLine());
			Double height = Double.parseDouble(sc.nextLine());
			Triangle triangle = new Triangle(base, height);
			triangle.computeArea();
			System.out.printf("Area of triangle is %.2f",triangle.getArea());
		}
		else {
			System.out.println("Invalid choice");
		}
		sc.close();

	}

}
