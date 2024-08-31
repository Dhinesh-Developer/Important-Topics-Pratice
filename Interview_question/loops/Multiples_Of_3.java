package loops;

import java.util.Scanner;

public class Multiples_Of_3 {
	public static void multiplesOf3(int n)
	{
		for(int i=1;i<=n*3;i++)
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		/*
		 * write a program to print the multiples of 3./
		 * input = 7    output = 3 6 9 12 15 18 21 
		 */

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		multiplesOf3(n);
	}

}
