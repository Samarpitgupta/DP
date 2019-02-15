package com.adapter_design_pattern1;

public class AdapterMainTest {

	private static Volt getThisVolt(SocketAdapter socketAdapter, int i)
	{
		switch(i)
		{
		case 3: 
			return socketAdapter.get3Volts();

		case 12:
			return socketAdapter.get12Volts();
	
		case 120:
			return socketAdapter.get120Volts();

		default:
			 return socketAdapter.get120Volts();
		}
	}
	
	public static void main(String args[])
	{
		
		SocketAdapter socketAdapter=new SocketObjectAdapterImplementation();	
		
		Volt v3=getThisVolt(socketAdapter, 3);
		Volt v12=getThisVolt(socketAdapter, 12);
		Volt v120=getThisVolt(socketAdapter, 120);
		
		// Using Socket Object Adapter
			System.out.println("Using Socket Object Adapter: ");
			System.out.println();
			System.out.println("V3 volts "+v3.getVolts()+" Volts");
			System.out.println("V12 volts "+v12.getVolts()+" Volts");
			System.out.println("V120 volts "+v12.getVolts()+" Volts");
							
			System.out.println("---------------------------------------");
	    // Using Socket Class Adapter
			System.out.println("Using Socket Class Adapter: ");
			System.out.println();
			System.out.println("v3 volts using Class Adapter="+v3.getVolts());
			System.out.println("v12 volts using Class Adapter="+v12.getVolts());
			System.out.println("v120 volts using Class Adapter="+v120.getVolts());
	}
}
