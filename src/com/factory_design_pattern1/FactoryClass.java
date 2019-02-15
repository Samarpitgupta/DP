package com.factory_design_pattern1;

public class FactoryClass {

	public static Computer getComputer(String type,String RAM, String HDD, String CPU)	
	{
		if("PC".equalsIgnoreCase(type))
		{
			return new PC(RAM,HDD,CPU);
		}
		else if("SERVER".equalsIgnoreCase(type))
		{
			return new Server(RAM,HDD,CPU);
		}
		return null;
		
	}
}
