package com.factory_design_pattern1;

public abstract class Computer {

	abstract String getRAM();
	abstract String getHDD();
	abstract String getCPU();
	
	@Override
	public String toString() {
		return "Computer [getRAM()=" + getRAM() + ", getHDD()=" + getHDD() + ", getCPU()=" + getCPU() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
		
}
