package com.adapter_design_pattern2;

public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Mallard duck quak quak..");
	}

	@Override
	public void fly() {
		System.out.println("Mallard Duck is flying..");
	}

}
