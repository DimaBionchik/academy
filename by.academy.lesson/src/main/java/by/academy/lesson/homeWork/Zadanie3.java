package by.academy.lesson.homeWork;

import java.util.Scanner;

public class Zadanie3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число от 1 до 10 :");
		int y = sc.nextInt();
		sc.close();
		int x;
		for (x = 0; x < 11; x++) {
			System.out.println(y + " * " + x + " = " + y * x);
		}
	}

}
