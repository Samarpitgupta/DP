package com.facade_design_pattern;

import java.sql.Connection;

public class OracleHelper {

	public static Connection getOracleConnection() 
	{
		return null;
	}
	
	public void generateOracle_PDFReport(String tablename, Connection con)
	{
		System.out.println("Oracle database report in the form of PDF");
	}
	
	public void generateOracle_HTMLReport(String tablename, Connection con)
	{
		System.out.println("Oracle database report in the form of HTML");
	}
	
	public void generateOracle_TextReport(String tablename, Connection con)
	{
		System.out.println("Oracle database report in the form of Text");
	}
}
