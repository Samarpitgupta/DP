package com.facade_design_pattern;

import java.sql.Connection;

public class MySqlHelper {

	public static Connection getMySqlDBConnection()
	{
		return null;
	}
	
	public void generateMySql_PDFReport(String tablename, Connection con)
	{
		System.out.println("MySql database report in the form of PDF");
	}
	public void generateMySql_HTMLReport(String tablename, Connection con) 
	{
		System.out.println("MySql database report in the form of HTML");
	}
	
	public void generateMySql_TextReport(String tablename, Connection con)
	{
		System.out.println("MySql database report in the from of Text");
	}
	
}
