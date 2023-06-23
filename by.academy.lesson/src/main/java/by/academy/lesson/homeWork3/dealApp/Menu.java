package by.academy.lesson.homeWork3.dealApp;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		printMenu();
		Scanner scan = new Scanner(System.in);
		int choise = scan.nextInt();
		Product[] array = new Product[10];
		Deal1 deal = new Deal1();
		while (choise != 0) {

			switch (choise) {
			case 0:
				return;
			case 1:
				Product p = createProduct(scan);
				if (p == null) {
					break;
				}
				deal.addProduct(p);
				System.out.println("Add product.");

				break;
			case 2:
				
                System.out.print("Enter product name to remove: ");
                String productToRemove = scan.nextLine();
                boolean removed = deal.removeProduct(productToRemove);
                if (removed) {
                    System.out.println("Product removed successfully.");
                } else {
                    System.out.println("Product not found.");
                }
                break;

				
			}
			printMenu();
			choise = scan.nextInt();

		}
		System.out.println("Exit program");
		scan.close();
	}

	public static Product createProduct(Scanner scan) {
		System.out.println("Enter product type(Banan,Apelsin,Vino");
		String type = scan.next();
		switch (type) {
		case "Vino":
			System.out.println("Enter product price: ");
			double price = scan.nextDouble();
			System.out.println("Enter product name : ");
			String name = scan.next();
			System.out.println("Enter product quantity: ");
			int quantity = scan.nextInt();
			System.out.println("Enter product color :");
			String colorVine = scan.next();
			System.out.println("Product added.Your product is Vino: price " + price + ", quantity  " + quantity
					+ ", name " + name + ", color " + colorVine + " . ");

			return new Vino(price, quantity, name, colorVine);

		case "Apelsin":
			System.out.println("Enter product price: ");
			double price1 = scan.nextDouble();
			System.out.println("Enter product quantity: ");
			int quantity1 = scan.nextInt();
			System.out.println("Enter product name : ");
			String name1 = scan.next();
			System.out.println("Enter product sort : ");
			String sort = scan.next();
			System.out.println("Product added.Your product is Apelsin: price " + price1 + ", quantity  " + quantity1
					+ ", name " + name1 + ", sort " + sort + " . ");
			return new Apelsin(price1, quantity1, name1, sort);
		case "Banan":
			System.out.println("Enter product price: ");
			double price2 = scan.nextDouble();
			System.out.println("Enter product quantity: ");
			int quantity2 = scan.nextInt();
			System.out.println("Enter product name : ");
			String name2 = scan.next();
			System.out.println("Enter product quantity vetv  : ");
			int vetv = scan.nextInt();
			System.out.println("Product added.Your product is Banan: price " + price2 + ", quantity  " + quantity2
					+ ", name " + name2 + ", vetv " + vetv + " . ");
			 return new Banan(price2,quantity2,name2,vetv);
	
		}
		return null;
	}

	public static void printMenu() {
		System.out.println("0 - exit program.");
		System.out.println("1 - add product.");
		System.out.println("2 - delete product.");

	}

}
