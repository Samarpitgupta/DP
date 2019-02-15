package com.proxy_design_pattern;

public class RealInternetAccess implements OfficeInternetAccess{

	
	private String empName;
	
	public RealInternetAccess(String empName)
	{
		this.empName=empName;
	}
	@Override
	public void grantInternetAccess() {
		
		System.out.println("Internet access granted to employees"+empName );	
	}

}
