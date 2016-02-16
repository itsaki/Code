package javaBabyProgramsUtils;
//import java.util.Scanner;

public class FactorialUtil {
	public static int factorialUtil(int n) {
		int factorial = 0;
		
		
		if (n == 0)
		{
			return 1;	
		}
		else
		{
			factorial = n* factorialUtil(n-1);
			System.out.println("Factorial of " + n + " is " + factorial);
			return factorial;
		}
		
	}
	
	
}
