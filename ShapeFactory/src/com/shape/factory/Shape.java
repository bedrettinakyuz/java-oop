package com.shape.factory;

public class Shape {
	protected String shapeName;
	protected double area;
	protected double circumference;

	
	
	
	public Shape(String shapeName, double area, double circumference) {
	
		this.shapeName = shapeName;
		this.area = area;
		this.circumference = circumference;
	}
	
	

	public Shape() {
		
	}



	public void draw () {
		
		System.out.println("Shape is drawing");
	}
	
	public void erase() {
		
		System.out.println("Shape is erasing");
	}
	
	public void calculateArea() {
		System.out.println("Shape area is calculating");
	}
	
	public void calculateCircumference() {
		System.out.println("Shape circumference is calculating ");
	}

	public String getShapeName() {
		return shapeName;
	}

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getCircumference() {
		return circumference;
	}

	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}


}
