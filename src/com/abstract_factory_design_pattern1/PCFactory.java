package com.abstract_factory_design_pattern1;

public class PCFactory implements ComputerAbstractFactory {

	private String RAM;
	private String HDD;
	private String CPU;

	public PCFactory(String rAM, String hDD, String cPU) {
		super();
		RAM = rAM;
		HDD = hDD;
		CPU = cPU;
	}

	@Override
	public Computer createComputer() {
				return new PC(RAM,HDD,CPU);
	}

}
