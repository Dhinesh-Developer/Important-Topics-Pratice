package loops;

import java.util.Scanner;

public class multipes_Of_2_Between_N {

	public static void MultiplesOf2BetweenN(int n)
	{
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
	}
	public static void main(String[] args) {
		/*
		 * write a program to print the multiples of 2 till N.
		 * input = 15   ouput = 2 4 6 8 10 12 14 
		 */

		Scanner in = new Scanner( System.in);
		int n = in.nextInt();
		MultiplesOf2BetweenN(n);
	}

}
