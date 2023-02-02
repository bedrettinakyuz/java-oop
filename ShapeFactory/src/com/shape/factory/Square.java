package com.shape.factory;

public class Square extends Shape {

	public Square() {};
	public Square(String shapeName, double area, double circumference) {
		super(shapeName, area, circumference);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void draw() {
		System.out.println("Square is drawing");
	}
}
