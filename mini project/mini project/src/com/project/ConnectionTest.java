package com.project;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
	Connection connection=null;
	public Connection getConnection() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	  connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
   return connection;
}
}