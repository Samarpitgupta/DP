package com.factory_design_pattern;

public class PaneerTikkaPizza implements Pizza{

	@Override
	public void bake() {
	System.out.println("paneer tikka is baking........\n proccess completed");
	}

	@Override
	public void prepare() {
			System.out.println("paneer tikka is preparing.....\n process comleted");
	}

	@Override
	public void cut() {
		System.out.println("slicing done...order is ready");
	}

}
