package com.proxy_design_pattern;

public class ProxyInternetAccess implements OfficeInternetAccess {

	private String empName;
	private RealInternetAccess realAccess;
	
	public ProxyInternetAccess(String empName) {
		
		this.empName=empName;
	}
	public int getRole(String empName)
	{
		return 3;
	}
	@Override
	public void grantInternetAccess() {
		if(getRole(empName)>5)
		{
			realAccess=new RealInternetAccess(empName);
			realAccess.grantInternetAccess();
		}
		else
		{
			System.out.print("Your id is below 5. You can not access the Internet");
		}
	}
	
}
