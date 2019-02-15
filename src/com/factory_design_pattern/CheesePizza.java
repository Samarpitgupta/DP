package com.factory_design_pattern;

public class CheesePizza   implements Pizza {

	@Override
	public void bake() {
		System.out.println("baking Cheese Pizza");
	}

	@Override
	public void prepare() {
		System.out.println("preparing Cheese Pizza");
	}

	@Override
	public void cut() {
		System.out.println("slicing Cheese Pizza\n Order is ready");
		
	}

}
