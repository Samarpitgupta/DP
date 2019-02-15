package com.facade_design_pattern;

import java.sql.Connection;

public class HelperFacade {

	public static enum DBTypes {
		MYSQL, ORACLE;
	}

	public static enum ReportTypes {
		HTML, PDF, TEXT;
	}

	public static void generateReport(DBTypes dbtype, ReportTypes reportTypes, String tableName) {
		Connection connection = null;
		switch (dbtype) {
		case MYSQL:
			connection = MySqlHelper.getMySqlDBConnection();
			MySqlHelper mySqlHelper = new MySqlHelper();

			switch (reportTypes) {
			case HTML:
				mySqlHelper.generateMySql_HTMLReport(tableName, connection);
				break;
			case PDF:
				mySqlHelper.generateMySql_PDFReport(tableName, connection);
				break;
			case TEXT:
				mySqlHelper.generateMySql_TextReport(tableName, connection);
				break;
			}
		case ORACLE:
			connection=OracleHelper.getOracleConnection();
			OracleHelper oracleHelper=new OracleHelper();
			
			switch(reportTypes)
			{
			case HTML:
				oracleHelper.generateOracle_HTMLReport(tableName, connection);
				break;
			case PDF:
				oracleHelper.generateOracle_PDFReport(tableName, connection);
				break;
		
			}
		}
	}
}
