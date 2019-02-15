package com.proxy_design_pattern;

public class ProxyInternetAccessClient {

	public static void main(String args[])
	{
		OfficeInternetAccess e=new ProxyInternetAccess("Samarpit");
		e.grantInternetAccess();
	}
}
