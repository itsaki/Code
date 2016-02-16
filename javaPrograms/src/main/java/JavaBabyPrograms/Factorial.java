package JavaBabyPrograms;

import java.util.Scanner;


public class Factorial {
public static void main(String[] param){
	int n = 0;
	Scanner i = new Scanner(System.in);
	System.out.println("Enter a number to find its factorial");
	n = i.nextInt();
	javaBabyProgramsUtils.FactorialUtil.factorialUtil(n);
	}
}
