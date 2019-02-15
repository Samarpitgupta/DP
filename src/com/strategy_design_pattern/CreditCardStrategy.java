package com.strategy_design_pattern;

public class CreditCardStrategy implements  PaymentStrategy{

	private int cvv;
	private String name;
	private int creditCardNo;
	private int pin;
	
	
	public CreditCardStrategy(int cvv, String name, int creditCardNo, int pin) {
	
		this.cvv=cvv;
		this.name=name;
		this.creditCardNo=creditCardNo;
		this.pin=pin;
		
	}
	
	@Override
	public void pay(int amount) {		
		System.out.println("amount "+amount+"rs. paid to shop by creadit/debit card");
	}	
}
