package com.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Scanner;
public class UserRegistration {
	public UserRegistration userDetail() {
		UserRegistration userRegistration = new UserRegistration();
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER USER NAME : ");
		String Name =scanner.next();
		
		System.out.println("Enter Password: ");
		String password = scanner.next();
	     HashMap<String,String> hashmap=new HashMap<String,String>();
		Connection connection=null;
		PreparedStatement ps = null;
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection=connectionTest.getConnection();
			ps=connection.prepareStatement("select * from user");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				String uName=rs.getString("UserName");
				String pWord=rs.getString("password");
				hashmap.put(uName,pWord);
			}
			if ((!hashmap.containsKey(Name))&&(!hashmap.containsValue(password))) {
				UserLogin userLogin = new UserLogin();
				userLogin.getUserAccess(Name, password);
				DisplayMenu displayMenu = new DisplayMenu();
				displayMenu.getMenu();
				PurchaseProduct purchaseProduct = new PurchaseProduct();
				purchaseProduct.userPurchaseDetail(Name);
				TotalPrise totalPrise = new TotalPrise();
				totalPrise.getPrise(Name);

			}
			else if ((hashmap.containsKey(Name))&&(!hashmap.containsValue(password))){
				System.out.println("Username alredy exit and Wrong password");
			}
			else if ((hashmap.containsKey(Name))&&(hashmap.containsValue(password))) {
				DisplayMenu displayMenu = new DisplayMenu();
				displayMenu.getMenu();
				PurchaseProduct purchaseProduct = new PurchaseProduct();
				purchaseProduct.userPurchaseDetail(Name);
				TotalPrise totalPrise = new TotalPrise();
				totalPrise.getPrise(Name);

			}
			
	
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return userRegistration;
	

	}
}
