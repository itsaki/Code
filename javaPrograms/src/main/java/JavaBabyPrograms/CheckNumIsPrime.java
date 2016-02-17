package JavaBabyPrograms;

import java.util.Scanner;

public class CheckNumIsPrime {
	public static void main (String[] args)
	{
		int n = 0;
		boolean isNumPrime;
		
		Scanner i = new Scanner(System.in);
		System.out.println("Enter a number to find if its prime");
		n = i.nextInt();
		
		isNumPrime = javaBabyProgramsUtils.FactorialUtil.checkNumIsPrimeUtil(n);
		
		System.out.println(isNumPrime);
}
}