package javaImpUtils;

public class ReverseStringRecurssionUtil {
	public static String reverseString(String str) {

		String reverse = "";
		if (str.length() == 1) {
			return str;
		} else {
			reverse += str.charAt(str.length() - 1)
					+ reverseString(str.substring(0, str.length() - 1));
			return reverse;
		}
	}
}
