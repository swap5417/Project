package com.project;

import java.util.Scanner;

//import java.util.Scanner;

public class MainClass {
	public static void main (String [] args) {
		System.out.println("WELCOME TO C1 ONLINE SHOPPING");
		System.out.println("SELECT ACCESS MODE");
		System.out.println("Enter 1 for AdminMode");
		System.out.println("Enter 2 for User Mode");
		System.out.println("Enter 3 for Exit");
		boolean repeat=true;
		Scanner scanner =new Scanner(System.in);
		while(repeat) {
		System.out.println("Enter Your Choice : ");
		int i=scanner.nextInt();
		switch(i) {
		case 1:
			System.out.println("Admin MODE");
			AdminMode adminMode =new AdminMode();
			adminMode.adminAccess();
			
			break;
		case 2:
			System.out.println("User MODE");
			UserMode userMode = new UserMode();
			userMode.getUserAccess();
			
			break;
		case 3:
			System.out.println("EXIT....THANK YOU");
			repeat=false;
			break;
		default:
			System.out.println("invalid input...try again");
			repeat=true;
			break;
		}
		
		//InsertUserData insertUserData = new InsertUserData();
		//insertUserData.insertData();
		//UserLogin userLogin = new UserLogin();
		//userLogin.getUserData();
	}
	}
}
