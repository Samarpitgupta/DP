package com.factory_design_pattern1;

public class PC extends Computer{

	
	private String RAM;
	private String HDD;
	private String CPU;
		
	public PC(String rAM, String hDD, String cPU) {
		super();
		RAM = rAM;
		HDD = hDD;
		CPU = cPU;
	}

	@Override
	String getRAM() {

		return this.RAM;
	}

	@Override
	String getHDD() {
		
		return this.HDD;
	}

	@Override
	String getCPU() {
		
		return this.CPU;
	}

}
