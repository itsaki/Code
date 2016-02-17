package javaBabyProgramsUtils;
//import java.util.Scanner;

public class FactorialUtil {
	
	public static int factorialUtil(int n) 
	{	
		if (n == 0)
		{
			return 1;	
		}
		else
		{
			return  n* factorialUtil(n-1);
				
		}	
	}
	
	
	public static boolean checkNumIsPrimeUtil(int n)
	{
		int sqrt = (int) Math.sqrt(n) + 1;
		for (int i = 2; i < sqrt; i++) 
		{ if (n % i == 0) 
		return false;
		} 
	return true; 
		}	
	
	
	public static int fibonacciSeriesUtil(int n)
	{ 
			if(n == 1 || n == 2)
			{ 
				return 1; 
			} 
			return fibonacciSeriesUtil(n-1) + fibonacciSeriesUtil(n -2); //recursion
	}

	
	public static void swapTwoNumWithoutTempUtil(int x,int y)
	{
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("After Swapping: " + "x=" + x + ", y=" + y);
	}
	
}
