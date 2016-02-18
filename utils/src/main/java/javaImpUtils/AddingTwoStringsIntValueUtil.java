package javaImpUtils;

import java.util.*;

public class AddingTwoStringsIntValueUtil {

	public static int twoStringsAddition(String str1, String str2) {

		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		int c = a + b;

		System.out.println(c);
		return c;
	}
}
