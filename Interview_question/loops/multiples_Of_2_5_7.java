package loops;

import java.util.Scanner;

public class multiples_Of_2_5_7 {
	public static void multiplesBetween2and5and7(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%2==0 || i%5==0 || i%7==0)
			{
				System.out.print(i+ " ");
			}
		}
	}

	public static void main(String[] args) {

		/*
		 * write a program to print multiples of 2 and 5 and 7
		 * input = 15     output = 2 4 5 6 7 8 10 12 14 15 
		 * input = 50   output = 2 4 5 6 7 8 10 12 14 15 16 18 20 21 22 24 25 26 28 30 32 34 35 36 38 40 42 44 45 46 48 49 50  
		 */

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		 multiplesBetween2and5and7(n);
	}

}
