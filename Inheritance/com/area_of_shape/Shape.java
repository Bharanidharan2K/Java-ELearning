package com.area_of_shape;

public class Shape {
	protected Double area;
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	public void computeArea() {
		this.area = 0.0;
	}
}
