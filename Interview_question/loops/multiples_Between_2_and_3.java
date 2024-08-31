package loops;

import java.util.Scanner;

public class multiples_Between_2_and_3 {
	public static void multiplesBetween2and3(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%2==0 || i%3==0)
			{
				System.out.print(i+ " ");
			}
		}
	}

	public static void main(String[] args) {
		/*
		 * write a program to print multiples of 2 and 3
		 * input = 15     output = 2 3 4 6 8 9 10 12 14 15 
		 * input = 50   output = 2 3 4 6 8 9 10 12 14 15 16 18 20 21 22 24 26 27 28 30 32 33 34 36 38 39 40 42 44 45 46 48 50 
		 */

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		 multiplesBetween2and3(n);
	}

}
