package com.project;

import java.util.Scanner;

public class PurchaseProduct {
	public void userPurchaseDetail(String name) {
		System.out.println("select 1 for Dell");
		System.out.println("select 2 for hp");
		System.out.println("select 3 for Lenovo");
		System.out.println("select 4 for Asus");
		System.out.println("select 5 for RedmiBook");
		System.out.println("select 6 for MackBook");
		System.out.println("select 7 for Acer");
		System.out.println("select 8 for MSI");
		System.out.println("select 9 for LAVA");
		System.out.println("select 10 for HCL");
		System.out.println("select 0 for Exit");
		
		boolean repeat=true;
		Scanner scanner =new Scanner(System.in);
		while(repeat) {
		System.out.println("Enter Your Choice : ");
		int i=scanner.nextInt();
		System.out.println("Enter Quantity: ");
		int quan=scanner.nextInt();
		
		AddToCart addToCart =new AddToCart();
		UpdateQuantity updateQuantity = new UpdateQuantity();
		switch(i) {
		case 1:
			String dell="Dell";
			addToCart.insertProduct(name, dell, quan);
			
			updateQuantity.getUpdateQuantity(quan, dell);
			break;
		case 2:
		
			String hp="hp";
			addToCart.insertProduct(name, hp, quan);
		
			updateQuantity.getUpdateQuantity(quan, hp);
			break;
		case 3:
			String lenovo="Lenovo";
			addToCart.insertProduct(name, lenovo, quan);
			updateQuantity.getUpdateQuantity(quan, lenovo);
			break;
		case 4:
			String asus="Asus";
			addToCart.insertProduct(name, asus, quan);
			updateQuantity.getUpdateQuantity(quan, asus);
			break;
		case 5:
			String redmiBook="RedmiBook";
			addToCart.insertProduct(name, redmiBook, quan);
			updateQuantity.getUpdateQuantity(quan, redmiBook);
			break;
		case 6:
			String macBook="MacBook";
			addToCart.insertProduct(name, macBook, quan);
			updateQuantity.getUpdateQuantity(quan, macBook);
			break;
		case 7:
			String asur="Asur";
			addToCart.insertProduct(name, asur, quan);
			updateQuantity.getUpdateQuantity(quan, asur);
			break;
		case 8:
			String msi="MSI";
			addToCart.insertProduct(name, msi, quan);
			updateQuantity.getUpdateQuantity(quan, msi);
			break;
		case 9:
			String lava="LAVA";
			addToCart.insertProduct(name, lava, quan);
			updateQuantity.getUpdateQuantity(quan, lava);
			break;
		case 10:
			String hcl="HCL";
			addToCart.insertProduct(name, hcl, quan);
			updateQuantity.getUpdateQuantity(quan, hcl);
			break;
		case 0:
			System.out.println("EXIT....thank you");
			repeat=false;
			break;
		default:
			System.out.println("invalid");
		}
		
	}
		
	}
}
