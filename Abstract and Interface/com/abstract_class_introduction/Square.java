package com.abstract_class_introduction;

public class Square extends Shape {
	private Float side;
	public Square() {}
	public Square(Float side) {
		this.side = side;
	}
	public Float getSide() {
		return side;
	}
	public void setSide(Float side) {
		this.side = side;
	}
	@Override
	public Double calculatePerimeter() {
		return 4.0*this.getSide();
	}
	
}
