package com.abstract_class_introduction;

public class Rectangle extends Shape {
	private Float length;	
	private Float breadth;
	public Rectangle() {}
	public Rectangle(Float length, Float breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public Float getLength() {
		return length;
	}
	public void setLength(Float length) {
		this.length = length;
	}
	public Float getBreadth() {
		return breadth;
	}
	public void setBreadth(Float breadth) {
		this.breadth = breadth;
	}
	@Override
	public Double calculatePerimeter() {
		return 2.0*(this.getLength()+this.getBreadth());
	}
	
}
