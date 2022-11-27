package com.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DisplayMenu {
	public DisplayMenu getMenu() {
		DisplayMenu displayMenu = new DisplayMenu();
		Connection connection=null;
		PreparedStatement ps = null;
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection=connectionTest.getConnection();
			ps=connection.prepareStatement("SELECT * FROM admin ORDER BY Name");
			ResultSet rs=ps.executeQuery();
			String pId = "ProductId";
			String descr = "Description";
			String prise="Prise";
			String name ="Name";
			String qty ="Quantity";
			System.out.printf("%-30s%-30s%-30s%-30s%-30s\n", pId,descr,prise,name,qty);
			while(rs.next()) {
			
				int  Id = rs.getInt("ProductId");
				String description = rs.getString("Description");
				String pr=rs.getString("Prise");
				String pname =rs.getString("Name");
				String quan =rs.getString("Quantity");
				System.out.printf("%-30s%-30s%-30s%-30s%-30s\n", Id,description,pr,pname,quan);
			}
		}
			catch(Exception e) {
				System.out.println(e);
			}
		return displayMenu;
	
		}
}
