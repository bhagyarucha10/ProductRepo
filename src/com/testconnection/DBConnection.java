package com.testconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	
	public static Connection getConnection()
	{
		Connection con =null;
	
		try
		{
			
		
		Class.forName("org.postgresql.Driver");
    	con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/capg",
    			 "postgres", "Shreemb2004r");
		}
		catch(Exception e) {}
    	return con;
	}
}
