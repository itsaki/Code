package JavaBabyPrograms;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] param){
		System.out.println("Enter number upto which Fibonacci series to print: ");
		int n = new Scanner(System.in).nextInt();
		
		System.out.println("Fibonacci series upto " + n +" numbers : ");

		for(int i=1; i<=n; i++){
            System.out.print(javaBabyProgramsUtils.FactorialUtil.fibonacciSeriesUtil(i) +" ");
	}
	}
} 

