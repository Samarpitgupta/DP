package com.abstract_factory_design_pattern1;

public class ServerFactory implements ComputerAbstractFactory {

	private String RAM;
	private  String HDD;
	private String CPU;
		
	public ServerFactory(String rAM, String hDD, String cPU) {
	//	super();
		RAM = rAM;
		HDD = hDD;
		CPU = cPU;
	}
	
	@Override
	public Computer createComputer() {
		return new Server(RAM,HDD,CPU);
	}

}
