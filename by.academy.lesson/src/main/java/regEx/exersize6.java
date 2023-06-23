package regEx;

public class exersize6 {

	public static void main(String[] args) {

		String text = " Hey      There!     How      Are you doing";
		final String twoSpaces = "  ";
		final String oneSpaces = " ";
		String regEx = "\\s{2,}"; 
		while (text.contains(regEx)) {
			String replace = text.replace(regEx, oneSpaces);
			text = replace;
		}
		System.out.println(text);

	}

}
