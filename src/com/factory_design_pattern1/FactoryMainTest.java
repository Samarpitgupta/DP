package com.factory_design_pattern1;

public class FactoryMainTest {

	public static void main(String args[])
	{
	
		Computer c=FactoryClass.getComputer("PC", "4GB","50GB","1.5GHZ");
		Computer c2=FactoryClass.getComputer("SERVER","4GB","50GB","1.5GHZ");
		
		System.out.println(c);
		System.out.println();
		System.out.println(c2);
		
	}
	
}
