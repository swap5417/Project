package com.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegistredList {
	public void getRegistredList() {
		Connection connection=null;
		PreparedStatement ps = null;
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection=connectionTest.getConnection();
			ps=connection.prepareStatement("SELECT * FROM user ");
			ResultSet rs=ps.executeQuery();
			String uName = "UserName";
			String pWord = "Password";
		
			System.out.printf("%-30s%-30s\n", uName,pWord);
			while(rs.next()) {
			
				
				String Name = rs.getString("UserName");
				String upassword=rs.getString("Password");
			
				System.out.printf("%-30s%-30s\n", Name,upassword);
			}
		}
			catch(Exception e) {
				System.out.println(e);
			}
	}

}
