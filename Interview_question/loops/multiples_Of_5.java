package loops;

import java.util.Scanner;

public class multiples_Of_5 {
	public static void multiplesOf5(int n)
	{
		for(int i=1;i<=n*5;i++)
		{
			if(i%5==0)
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {

		/*
		 * write a program to print the multiples of 3./
		 * input = 5    output = 5 10 15 20 25
		 */

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		multiplesOf5(n);
	}

}
