package regEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mail {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String email = scan.next();

		Pattern VALID_EMAIL_ADRESS_REGEX = Pattern.compile("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");

		Matcher matcher = VALID_EMAIL_ADRESS_REGEX.matcher(email);
		boolean matches = matcher.matches();
		System.out.println(matches);
	}
}