package JavaBabyPrograms;

import java.util.Scanner;

public class SwapTwoNumWithoutTemp {
public static void main(String[] param){
	System.out.println("Enter two numbers to swap:");	
	int x = new Scanner(System.in).nextInt();
	int y = new Scanner(System.in).nextInt();
	
	System.out.println("Before Swapping: " + "x=" + x + ", y=" + y);
	
	javaBabyProgramsUtils.FactorialUtil.swapTwoNumWithoutTempUtil( x, y);
	
	}
}
