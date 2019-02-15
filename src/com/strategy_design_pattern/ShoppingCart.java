package com.strategy_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	List<Item> cartItems;
	
	public ShoppingCart() {
	
		this.cartItems=new ArrayList<Item>();
	
	}
	
	public void addItem(Item i)
	{
		this.cartItems.add(i);
	}
	
	public void removeItem(Item i)
	{
		this.cartItems.remove(i);
	}
	
	public int calculateTotal()
	{
		int sum=0;
		
		for(Item i: cartItems)
		{
			sum=sum+i.getItemPrice();		
		}
		return sum;
	}
	
	public void pay(PaymentStrategy paymentMethod )
	{
		int amount=calculateTotal();
		paymentMethod.pay(amount);
	}
}
