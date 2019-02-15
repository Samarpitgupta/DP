package com.chain_of_responsibility_design_pattern;

public class ConcreteHandlerTwo extends Handler{

	@Override
	public void handleRequest(Request request) {
		
		if(request.getValue()>0)
		{
			System.out.println("Positive values will be handled by ConcreteHandlerTwp");
		}
		else
		{
			System.out.println("Other handler will handle this request");
		}
	}

}
