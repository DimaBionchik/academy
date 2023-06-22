package by.academy.lesson.homeWork3.dealApp;

import java.util.Scanner;

public class DealApp {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		User s = new User("Vasgen", 40, 100);
		User b = new User("Dima", 20, 1500);
		Product[] products = new Product[10];

		products[0] = new Apelsin(12,6,"Krasnii","Horoshii");
		products[1] = new Banan(11.0, 6, "Dlinnii", 5);
		products[2] = new Vino(70.0,2,"Shardo","White");
	
		Deal1 deal = new Deal1("Minsk", b, s, products);
		System.out.println("Full deal cost " + deal.calcPrice());

	}

}
