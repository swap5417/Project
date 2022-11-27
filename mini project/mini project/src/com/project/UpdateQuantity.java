package com.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdateQuantity {
	public void getUpdateQuantity(int quan,String prname) {
		Connection connection=null;
		PreparedStatement ps = null;
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection=connectionTest.getConnection();
			ps=connection.prepareStatement("UPDATE ADMIN SET Quantity=Quantity-? WHERE Name=?");
			ps.setInt(1, quan);
			ps.setString(2, prname);
			int rs=ps.executeUpdate();
			System.out.println("QUANTITY UPDATED");
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
