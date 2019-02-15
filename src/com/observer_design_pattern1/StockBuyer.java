package com.observer_design_pattern1;

import java.util.Map;

public class StockBuyer implements StockBroker {

	@Override
	public void update(Map<String, Double> stockList) {
		System.out.println("Stock List is changed: ");
		stockList.forEach((Symbol,Value) -> System.out.println(Symbol+" : "+Value));
	}

}
