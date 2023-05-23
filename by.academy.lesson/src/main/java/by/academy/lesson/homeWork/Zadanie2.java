package by.academy.lesson.homeWork;

import java.util.Scanner;

public class Zadanie2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите тип данных : ");
		String dataType = scan.nextLine();
		System.out.println("Введите значение переменной : ");
		String variable = scan.nextLine();
		scan.close();

		switch (dataType) {
		case "int":
			int intValue = Integer.parseInt(variable);
			int ostatok = intValue % 2;
			System.out.println(" Остаток от деление на 2 : " + ostatok);
			break;
		case "double":
			double doubleValue = Double.parseDouble(variable);
			double procent = doubleValue * 0.7;
			System.out.println(" 70% от числа : " + doubleValue);
			break;
		case "float":
			float floatValue = Float.parseFloat(variable);
			float kvadrat = floatValue * floatValue;
			System.out.println("Квадрат числа равен : " + kvadrat);
			break;
		case "char":
			char charValue = variable.charAt(0);
			int charCode = (int) charValue;
			System.out.println("Код символа : " + charCode);
			break;
		case "String":
			System.out.println("Hello " + variable);
			break;
		default:
			System.out.println("Unsupported type");
			break;
		}
	// ChatGPT helped me solve this problem

	}

}
