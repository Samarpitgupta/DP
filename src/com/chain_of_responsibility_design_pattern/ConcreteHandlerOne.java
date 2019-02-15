package com.chain_of_responsibility_design_pattern;

public class ConcreteHandlerOne extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getValue()<0)
		{
			System.out.println("Handle negative values");
		}
		else
		{
			System.out.println("Handle values by otherHandler");
		}
	}

}
