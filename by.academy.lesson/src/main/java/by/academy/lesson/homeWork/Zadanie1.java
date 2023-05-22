package by.academy.lesson.homeWork;


import java.util.Scanner;

public class Zadanie1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ВВедите сумму покупки :");
		double startPrice = scan.nextDouble();
		System.out.println("Введите возраст покупателя :");
		int age = scan.nextInt();
		scan.close();
		double discount = 0.0;
		if (startPrice < 100) {
			discount = 0.05;
		} else if (startPrice >= 100 && startPrice < 200) {
			discount = 0.07;

		}else if ( startPrice >=200 && startPrice <300) {
			discount = 0.12;
			if (age > 18) {
				discount +=0.04;
			}else {
				discount -= 0.03;
			}
		}else if(startPrice >=300 && startPrice < 400) {
			discount = 0.15;
			
		}else if ( startPrice >= 400) {
			discount = 0.2;
		}
		double finalPrice = startPrice - (startPrice * discount);
		System.out.println("Финальная цена : " + finalPrice);
		

	}

}
