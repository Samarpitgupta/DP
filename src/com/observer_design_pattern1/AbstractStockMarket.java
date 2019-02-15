package com.observer_design_pattern1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class AbstractStockMarket {

	private List<StockBroker> stockBrokerList=new ArrayList<>();
	
	public void addStockBroker(StockBroker stockBroker)
	{
		stockBrokerList.add(stockBroker);
	}
	
	public void notifyStockBroker(Map<String, Double> stockList)
	{
		for(StockBroker broker: stockBrokerList)
		{
			broker.update(stockList);
		}
	}
	
	public abstract void addStock(String symbol, Double price);
	public abstract void update(String symbol, Double price);
	
}
