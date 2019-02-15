package com.strategy_design_pattern;

public class PayPalStrategy implements PaymentStrategy{

	private String email;
	private int pass;
	
	public PayPalStrategy(String email,int pass) {
	
		this.email=email;
		this.pass=pass;
	
	}
	@Override
	public void pay(int amount) {
	
	System.out.println("amount ---> '"+amount+"' Rs. paid to the shop ");	
	}

}
