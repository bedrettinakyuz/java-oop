package com.shape.factory;

public class ShapeFactory {

		ShapeFactory(){};
		
		public Shape createShape()
		{
			Shape shape = new Circle();
			return shape;
		}

}
