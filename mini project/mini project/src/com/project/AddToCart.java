package com.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AddToCart {
	public void insertProduct(String uname,String productname,int quant) {
		
		Connection connection=null;
		PreparedStatement ps = null;
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection=connectionTest.getConnection();
			ps=connection.prepareStatement("select Prise from ADMIN WHERE Name =?");
			ps.setString(1, productname);
			ResultSet rs=ps.executeQuery();
			
			 
			

			while(rs.next()) {
				ps=connection.prepareStatement("insert into HISTORY (UserName,ProductName,Prise,Quantity)"
						+ "values(?,?,?,?)");
			int x=rs.getInt("Prise");
			ps.setString(1, uname);
			ps.setString(2, productname);
			ps.setInt(3, x);
			ps.setInt(4, quant);
			ps.executeUpdate();
				
			
			}
		}
			catch(Exception e) {
				System.out.println(e);
			}
	}

}
