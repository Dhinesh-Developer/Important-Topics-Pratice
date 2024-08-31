package loops;

import java.util.Scanner;

public class sum_Of_Digits {
	public static void sumOfDigits(int n)
	{
		int sum = 0;
		int temp ;
		for(int i= 1;i<=n;i++)
		{
			temp = n%10;
			sum = sum + temp;
			n = n/10;
			
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		/*
		 * write a program to print the sum of the  umber
		 * 
		 * input = 12345  output= 14
		 */

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		sumOfDigits(n);
		}

}
