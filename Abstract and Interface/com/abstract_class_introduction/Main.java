package com.abstract_class_introduction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("List of Shapes:\r\n" + 
				"1.Circle\r\n" + 
				"2.Rectangle\r\n" + 
				"3.Square\r\n" + 
				"Enter your choice:");
		Integer choice = Integer.parseInt(sc.nextLine());
		switch(choice) {
		case 1:
			System.out.println("Enter the radius of the Circle:");
			Float radiusForCircle = Float.parseFloat(sc.nextLine());
			Shape circle = new Circle(radiusForCircle);
			System.out.printf("The perimeter is %.2f",circle.calculatePerimeter());
			break;
		case 2:
			System.out.println("Enter the length of the Rectangle:");
			Float length = Float.parseFloat(sc.nextLine());
			System.out.println("Enter the breadth of the Rectangle:");
			Float breadth = Float.parseFloat(sc.nextLine());
			Shape rectangle = new Rectangle(length, breadth);
			System.out.printf("The perimeter is %.2f",rectangle.calculatePerimeter());
			break;
		case 3:
			System.out.println("Enter the side of the Square:");
			Float side = Float.parseFloat(sc.nextLine());
			Shape square = new Square(side);
			System.out.printf("The perimeter is %.2f",square.calculatePerimeter());
			break;
		default:
			System.out.println("Invalid choice");
		}
		
		sc.close();

	}

}
