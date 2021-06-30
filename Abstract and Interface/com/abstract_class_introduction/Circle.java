package com.abstract_class_introduction;

public class Circle extends Shape {
	private Float radius;
	public Circle() {}
	public Circle(Float radius) {
		this.radius = radius;
	}
	public Float getRadius() {
		return radius;
	}
	public void setRadius(Float radius) {
		this.radius = radius;
	}
	@Override
	public Double calculatePerimeter() {
		return 2 * 3.14 * this.getRadius();
	}	
}
