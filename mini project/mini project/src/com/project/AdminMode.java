package com.project;

import java.util.Scanner;

public class AdminMode {
	public AdminMode adminAccess() {
	AdminMode adminMode =new AdminMode();
	System.out.println("WELCOME TO ADMIN AcCESS");
	System.out.println("SELECT ACCESS MODE");
	System.out.println("Enter 1 for Check PRODUCT QUANTITY");
	System.out.println("Enter 2 for GET USER REGISTRED LIST");
	System.out.println("Enter 3 for GET USER HISTORY");
	System.out.println("Enter 4 for EXIT ADMIN ACCESS");
	boolean repeat=true;
	Scanner scanner =new Scanner(System.in);
	while(repeat) {
	System.out.println("Enter Your Choice : ");
	int i=scanner.nextInt();
	switch(i) {
	case 1:
		System.out.println("CHECK PRODUCT QUANTITY");
		CheckQuantity checkQuantity = new CheckQuantity();
		System.out.println("ENTER PRODUCT ID =");
		int id =scanner.nextInt();
		checkQuantity.getQuantity(id);
			
		
		break;
	case 2:
		System.out.println("GET USER REGISTRED LIST");
		RegistredList registredList = new RegistredList();
		registredList.getRegistredList();
		break;
	case 3:
		System.out.println("GET USER PURCHACE HISTORY");
		UserPurchaseList userPurchaseList = new UserPurchaseList();
		userPurchaseList.getPurchaseList();
		break;
	case 4:
		System.out.println("EXIT....THANK YOU");
		repeat=false;
		break;
	default:
		System.out.println("invalid input...try again");
		repeat=true;
		break;
	
	
	}

	}
	return adminMode;
	}
}