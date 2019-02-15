package com.template_design_pattern;

public abstract class OrderProcessTemplate {

	public boolean isGift;
	public abstract void doSelect();
	public abstract void doPayment();
	public final void giftWrap()
	{
		try
		{
			System.out.println("wrap the gift");	
		}
		catch(Exception e)
		{
			System.out.println("gift wrap unsuccessfull");
		}
	}
	public abstract void doDelivery();
	public final void processOrder(boolean isGift)
	{
		doSelect();
		doPayment();
		if(isGift)
		{
			giftWrap();
		}
		doDelivery();	
	}
}
