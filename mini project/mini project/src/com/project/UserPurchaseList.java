package com.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserPurchaseList {
	public void getPurchaseList() {
		Connection connection=null;
		PreparedStatement ps = null;
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection=connectionTest.getConnection();
			ps=connection.prepareStatement("SELECT * FROM HISTORY");
			ResultSet rs=ps.executeQuery();
			String name = "UserName";
			String prName = "ProductName";
			String prise="Prise";
			String qty ="Quantity";
			System.out.printf("%-30s%-30s%-30s%-30s\n", name,prName,prise,qty);
			while(rs.next()) {
			
			    String uName=rs.getString("UserName");
				String prodName = rs.getString("Productname");
				int pr=rs.getInt("Prise");
			
				int quan =rs.getInt("Quantity");
				System.out.printf("%-30s%-30s%-30s%-30s\n", uName,prodName,pr,quan);
			}
		}
			catch(Exception e) {
				System.out.println(e);
			}
	}

}
