package com.template_design_pattern;

public class NetOrder extends OrderProcessTemplate{

	@Override
	public void doSelect() {
		
		System.out.println("Item added to online shopping cart"); 
        System.out.println("Get gift wrap preference"); 
        System.out.println("Get delivery address."); 
	}

	@Override
	public void doPayment() {
		System.out.println("make payment");
	}

	@Override
	public void doDelivery() {
		System.out.println("ship the product");
	}
	

}
