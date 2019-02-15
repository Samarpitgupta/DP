package com.adapter_design_pattern2;

public class WildTurkey implements Turkey{

	@Override
	public void gobble() {
	System.out.println("WildTurkey : gobble gobble..");
	}

	@Override
	public void fly() {
		System.out.println("Wild Turkey: I am flying ..");
	}

}
