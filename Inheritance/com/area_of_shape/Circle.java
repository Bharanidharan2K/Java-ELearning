package com.area_of_shape;

public class Circle extends Shape{
	private Double radius;
	public Circle() {}
	public Circle(Double radius) {
		this.radius = radius;
	}
	public Double getRadius() {
		return radius;
	}
	public void setRadius(Double radius) {
		this.radius = radius;
	}
	public void computeArea() {
		this.setArea((3.1428571)*(radius*radius));
	}
}
