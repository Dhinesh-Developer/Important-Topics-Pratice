package loops;

import java.util.Scanner;

public class Factors_Between_N {
	
	public static void factors(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
/*
 * Write a program to calculate the factorial of the given number.
 * input = 20    output = 1 2 4 5 15
 * input = 50    output = 1 2 5 10 25 50
 */
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		factors(n);
	}

}
