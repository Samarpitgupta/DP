package com.template_design_pattern;

public class TemplateMainClient {

	public static void main(String args[])
	{
		OrderProcessTemplate net1=new NetOrder();
		net1.processOrder(true);
		System.out.println();
		OrderProcessTemplate net2=new StoreOrder();
		net2.processOrder(false);
		
	}
}
