package com.chain_of_responsibility_design_pattern;

public class Request {

	private int m_value;
	private String m_description;
	
	public Request(int m_value,String m_description)
	{
		this.m_value=m_value;
		this.m_description=m_description;
		
	}
	
	public int getValue()
	{
		
		return m_value;
	}
	
	public String getDescription()
	{
		return m_description;
	}
	
}
