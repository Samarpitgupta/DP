package com.abstract_factory_design_pattern;

public abstract class AbstractFactory {

	public abstract Shape getShape(String value);
	public abstract Color getColor(String value);
	
	
}
