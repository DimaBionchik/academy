package by.academy.lesson.homeWork3.dealApp;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		printMenu();
		Scanner scan = new Scanner(System.in);
		int choise = scan.nextInt();
		Product[] array = new Product[10];
		Deal1 deal  = new Deal1();
		while (choise != 0) {

			switch (choise) {
			case 0:
				return;
			case 1:
				Product p = createProduct(scan);
				if(p ==null) {
					break;
				}
				deal.addProduct(p);
				System.out.println("Add product.");

				break;
			}
			printMenu();
			choise = scan.nextInt();

		}
		System.out.println("Exit program");
		scan.close();
	}
	public static Product createProduct(Scanner scan) {
		System.out.println("Enter product type");
		String type = scan.next();
		switch(type) {
		case "Vino" :
			System.out.println("Enter product price: ");
			double price = scan.nextDouble();
			System.out.println("Enter product name : ");
			String name  = scan.next();
			System.out.println("Enter product quantity: ");
			int quantity = scan.nextInt();	
			System.out.println("Enter product color :");
			String colorVine  = scan.next();
			System.out.println("Product added");
			
			return new Vino(price,quantity,name,colorVine);
			
			
		case "Apelsin":
			System.out.println("Enter product price: ");
			double price1  = scan.nextDouble();
			System.out.println("Enter product quantity: ");
			int quantity1 = scan.nextInt();
			
			//double price, int quantity, String name, String sort
		}
		return null;
	}

	public static void printMenu() {
		System.out.println("0 - exit program.");
		System.out.println("1 - add product.");

	}



}

