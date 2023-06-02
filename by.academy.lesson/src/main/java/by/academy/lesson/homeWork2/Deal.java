package by.academy.lesson.homeWork2;

import java.util.Scanner;

public class Deal {

	public static void main(String[] args) {
		int cardsForOnePlayer = 5;
		int players = 0;
		String[] suits = { "Пик", "Бубен", "Черв", "Треф" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз" };
		int quantity = suits.length * rank.length;

		for (;;) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Введите количество игроков : ");
			if (scan.hasNextInt()) {
				players = scan.nextInt();
				if (cardsForOnePlayer * players <= quantity) {
					break;
				} else {
					if (players == 0) {
						System.out.println("Игра прекращена.");
						break;
					} else if (players < 0) {
						System.out.println("Число игроков не может быть меньше нуля.");

					} else {
						System.out.println("Слишком много игроков.");
					}
				}
			} else {
				System.out.println("Вы ввели не число , или Ваше число слишком большое.");
			}
		}
		

		String[] deck = new String[quantity];
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deck[suits.length * i + j] = rank[i] + " " + suits[j];

			}
		}
		for (int i = 0; i < quantity; i++) {
			int randomCard = i + (int) (Math.random() * (quantity - i));
			String temp = deck[randomCard];
			deck[randomCard] = deck[i];
			deck[i] = temp;

		}
		for (int i = 0; i < players * cardsForOnePlayer; i++) {
			System.out.println(deck[i]);
			if (i % cardsForOnePlayer == cardsForOnePlayer - 1) {
				System.out.println();
			}
		}
		

	}

}
