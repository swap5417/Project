package com.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashSet;
import java.util.Scanner;

public class UserLogin {
	public UserLogin getUserAccess(String name,String password) {
		UserLogin userLogin = new UserLogin();
		
		Connection connection=null;
		PreparedStatement ps = null;
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection=connectionTest.getConnection();
			ps=connection.prepareStatement ("insert into user (Username,password) values(?,?) ");
		   ps.setString(1,name);
		   ps.setString(2, password);
	       ps. executeUpdate();
			System.out.println(" SUCCESSFULLY login... ");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return userLogin;
	}

}
