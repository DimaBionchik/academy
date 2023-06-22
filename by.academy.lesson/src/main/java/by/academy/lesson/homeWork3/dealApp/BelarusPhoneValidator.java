package by.academy.lesson.homeWork3.dealApp;

import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {
	 private static final String PHONE_PATTERN = "\\+375\\d{9}";

	@Override
	public boolean validate(String input) {
		// TODO Auto-generated method stub
		return Pattern.matches(PHONE_PATTERN, input);
	}
	 
}
