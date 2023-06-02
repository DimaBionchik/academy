package by.academy.lesson.homeWork2;

import java.util.Scanner;

public class Zadanie2_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите первое слово : ");
		String word1 = scanner.nextLine();
		System.out.println("Введите второе слово : ");
		String word2 = scanner.nextLine();
		if (word1.length() % 2 != 0 || word2.length() % 2 != 0) {
			System.out.println("Оба слова должны состаять из четного количества букв!");
			return;
		}
		int halfWord1 = word1.length() / 2;
		int halfWord2 = word2.length() / 2;
		String wordResult = word1.substring(0, halfWord1) + word2.substring(halfWord2);
		System.out.println("Результат : " + wordResult);
	}

}
