package com.adapter_design_pattern2;

public class TurkeyAdapter implements Duck{

	Turkey turkey;
	public TurkeyAdapter(Turkey turkey)
	{
		this.turkey=turkey;
	}
	@Override
	public void quack() {
			turkey.gobble();
	}

	@Override
	public void fly() {
		for(int i=1;i<6;i++)
		{
			turkey.fly();
		}
		
	}	
}
