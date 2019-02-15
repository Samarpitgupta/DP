package com.factory_design_pattern;

public class ChickenPizza implements Pizza{

	@Override
	public void bake() {
		System.out.println("baking Chicken Pizza in progress.....");
		System.out.println("baking is done");
		
	}

	@Override
	public void prepare() {
		System.out.println("preparing chicken pizza.....");
		System.out.println("CHIKEN PIZZA HAS BEEN NPREPARED");
		
	}

	@Override
	public void cut() {
		System.out.println("slicing is done.\n Order is ready");
		
	}
	
}
