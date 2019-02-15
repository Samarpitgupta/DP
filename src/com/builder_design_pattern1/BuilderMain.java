package com.builder_design_pattern1;

public class BuilderMain {

	public static void main(String args[])
	{
		Computer c=new Computer.ComputerBuilder("250GB", "8GB").
		setGraphicCardEnabled(true).build();
		System.out.println(c);	
	}
}
