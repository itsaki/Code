package javaImpUtils;

import java.util.Arrays;

public class MinimumPositiveNumFromArrayUtil {
	public static void findMinimumPositiveNum(int[] array) {
		Arrays.sort(array);
		int i;
		for (i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				System.out.println("Index is " + i);
				System.out.println("Minimum positive number is " + array[i]);
				break;
			}
		}

	}
}
