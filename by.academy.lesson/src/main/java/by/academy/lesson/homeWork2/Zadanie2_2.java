package by.academy.lesson.homeWork2;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie2_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите количество слов: ");
		int n = scanner.nextInt();
		scanner.nextLine();

		String[] words = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Введите слово " + (i + 1) + ": ");
			words[i] = scanner.nextLine();
		}

		String wordWithMinChars = findWordWithMinChars(words);
		System.out.println("Слово с минимальным числом различных символов: " + wordWithMinChars);

		scanner.close();
	}

	static String findWordWithMinChars(String[] words) {
		String resultWord = words[0];
		int minCharsCount = countChars(resultWord);

		for (int i = 1; i < words.length; i++) {
			int distinctCharsCount = countChars(words[i]);
			if (distinctCharsCount < minCharsCount) {
				minCharsCount = distinctCharsCount;
				resultWord = words[i];
			}
		}

		return resultWord;
	}

	static int countChars(String word) {
		char[] chars = word.toCharArray();
		Arrays.sort(chars);

		int distinctCharsCount = 1;
		for (int i = 1; i < chars.length; i++) {
			if (chars[i] != chars[i - 1]) {
				distinctCharsCount++;
			}
		}

		return distinctCharsCount;

	}

}
