package com.observer_design_pattern1;

import java.util.Map;

public class StockViewer implements StockBroker{

	@Override
	public void update(Map<String, Double> stockList) {
	System.out.println("StockPrice List is changed: ");	
	stockList.forEach((Symbol,Value)->System.out.println(Symbol+" : "+Value));
	}

	public void modify(Map<String, Double> stockList)
	{
		System.out.println("Modify all the records of");
	}
}
