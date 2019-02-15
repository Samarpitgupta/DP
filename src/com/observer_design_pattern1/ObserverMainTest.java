package com.observer_design_pattern1;

public class ObserverMainTest {

	public static void main(String args[])
	{
		StockBroker buyer=new StockBuyer();
		StockBroker viewer=new StockViewer();
		
		AbstractStockMarket market=new StockMarket();
		
		market.addStockBroker(buyer);
		market.addStockBroker(viewer);
		
		
		market.addStock("MSS", 110.00);
		market.addStock("OSS", 140.00);
		
		System.out.println();
		market.update("OSS", 150.00);
		market.update("TSS", 175.00);
		
		
	}
	
}
