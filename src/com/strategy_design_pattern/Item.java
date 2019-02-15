package com.strategy_design_pattern;

public class Item {
											
	private int itemId;
	private int itemPrice;
	
	public Item(int itemId, int itemPrice) {
		super();
		this.itemId = itemId;
		this.itemPrice = itemPrice;
	}
	public int getItemId() {
		return itemId;
	}
	public int getItemPrice() {
		return itemPrice;
	}
}
