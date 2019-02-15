package com.chain_of_responsibility_design_pattern;

public abstract class Handler {

	protected Handler m_successor;
	
	public void setSuccessor(Handler successor)
	{
		m_successor=successor;
	}
	
	public abstract void handleRequest(Request request);
	
}
