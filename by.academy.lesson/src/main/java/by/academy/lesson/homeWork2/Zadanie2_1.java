package homeWork2;

import java.util.Scanner;

public class Zadanie2_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first line : ");
		String firstString = scan.next();
		System.out.println("Enter the second line : ");
		String secondString = scan.next();
		boolean result = checkResult(firstString, secondString);
		System.out.println("Result : " + result);

	}

	public static boolean checkResult(String firstString, String secondString) {
		if (firstString.length() != secondString.length()) {
			return false;
		}
		int[] charCount = new int[128];
		for (int i = 0; i < firstString.length(); i++) {
			char c = firstString.charAt(i);
			charCount[c]++;
		}
		for (int i = 0; i < secondString.length(); i++) {
			char c = secondString.charAt(i);
			charCount[c]--;
			if (charCount[c] < 0) {
				return false;
			}
		}
		return true;
	}

}
