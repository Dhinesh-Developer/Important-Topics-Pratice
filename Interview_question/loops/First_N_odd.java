package loops;

import java.util.Scanner;

public class First_N_odd {

	public static void  printNOddNumbers(int n)
	{
		for(int i=0;i<n*2;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i); 
			}
		}
	}
	public static void main(String[] args) {
		/*
		 * write a program to print first N odd numbers .
		 * input = 5    output = 1 3 5 7 9 
		 */

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		printNOddNumbers(n);
	}

}
