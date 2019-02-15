package com.abstract_factory_design_pattern;

public class FactoryProducer {

	public static AbstractFactory getAbstractFactory(String choice)	
	{
		if(choice==null)
		{
			return null;
		}
		if(choice.equalsIgnoreCase("Color"))
		{
			return new ColorFactory();
		}
		else if(choice.equalsIgnoreCase("shape"))
		{
			return new ShapeFactory();
		}
		return null;
	}
}
