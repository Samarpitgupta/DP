package com.abstract_factory_design_pattern;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args)
	{
		
		AbstractFactory shapeFactory= FactoryProducer.getAbstractFactory("shape");
		AbstractFactory colorFactory=FactoryProducer.getAbstractFactory("color");
		
		Shape shape1=shapeFactory.getShape("circle");
		Color color1=colorFactory.getColor("Red");
		
		Shape shape2=shapeFactory.getShape("Rectangle");
		Color color2=colorFactory.getColor("Blue");
		
		shape1.draw();
		color1.fill();
		
		shape2.draw();
		color2.fill();
		
	}
	
	
}
