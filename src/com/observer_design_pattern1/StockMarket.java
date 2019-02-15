package com.observer_design_pattern1;

import java.util.HashMap;
import java.util.Map;

public class StockMarket extends AbstractStockMarket{

	private Map<String, Double> stockList=new HashMap<String, Double>();
	
	@Override
	public void addStock(String symbol, Double price) {
		System.out.println("Add Stock:\n "+symbol+" : "+price);
		stockList.put(symbol, price);
		
	}

	@Override
	public void update(String symbol, Double price) {
			stockList.put(symbol, price);
			notifyStockBroker(stockList);
	}
}
