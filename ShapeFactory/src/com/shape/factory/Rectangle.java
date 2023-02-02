package com.shape.factory;

public class Rectangle extends Shape {

	public Rectangle() {};
	public Rectangle(String shapeName, double area, double circumference) {
		super(shapeName, area, circumference);
		// TODO Auto-generated constructor stub
	}

	public void draw() {
		
		System.out.println("Rectangle is drawing");
	}
	
}
