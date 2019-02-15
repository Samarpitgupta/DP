package com.abstract_factory_design_pattern1;

public class Server extends Computer{

	private String RAM;
	private String HDD;
	private String CPU;
	
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

	public Server(String rAM, String hDD, String cPU) {
		super();
		RAM = rAM;
		HDD = hDD;
		CPU = cPU;
	}

	
}
