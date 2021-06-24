package com.area_of_shape;

public class Rectangle extends Shape{
	private Double length;	
	private Double breadth;	
	public Rectangle() {}
	public Rectangle(Double length, Double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public Double getLength() {
		return length;
	}
	public void setLength(Double length) {
		this.length = length;
	}
	public Double getBreadth() {
		return breadth;
	}
	public void setBreadth(Double breadth) {
		this.breadth = breadth;
	}
	public void computeArea() {
		this.setArea(breadth * length);
	}
}
