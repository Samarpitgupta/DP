package com.observer_design_pattern1;

import java.util.Map;

public interface StockBroker {

	public void update(Map<String,Double> stockList);
}
