package com.shape.factory;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeFactory factory = new ShapeFactory();
		Shape s = factory.createShape();
		s.draw();
	}

}
