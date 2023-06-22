package by.academy.lesson.homeWork3.dealApp;


import java.util.regex.Pattern;

public class DateValidator {
	  private static final String DATE_PATTERN_1 = "\\d{2}/\\d{2}/\\d{4}";
	    private static final String DATE_PATTERN_2 = "\\d{2}-\\d{2}-\\d{4}";

	    public boolean validate(String input) {
	        String pattern = "(" + DATE_PATTERN_1 + ")|(" + DATE_PATTERN_2 + ")";
	        return Pattern.matches(pattern, input);
	    }
}
