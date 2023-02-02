package com.shape.factory;

public class Circle extends Shape {

	public Circle() {};
	
	public Circle(String shapeName, double area, double circumference) {
		super(shapeName, area, circumference);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void draw()
	{
		System.out.println("Circle is drawing");
	}

	
	
}
