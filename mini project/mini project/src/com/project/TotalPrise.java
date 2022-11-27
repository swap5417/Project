package com.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TotalPrise {
	public void getPrise(String uname) {
		Connection connection=null;
		PreparedStatement ps = null;
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection=connectionTest.getConnection();
			ps=connection.prepareStatement("SELECT Prise,Quantity from HISTORY where UserName=?");
			ps.setString(1, uname);
			ResultSet rs=ps.executeQuery();
			int totalprise=0;
			while(rs.next()) {
			
				int pr=rs.getInt("Prise");
				int quan=rs.getInt("Quantity");
				totalprise=(pr*quan)+totalprise;
			
			}		

			System.out.println("TOTAL AMOUNT : "+totalprise);
		}
			catch(Exception e) {
				System.out.println(e);
			}
	}

}
