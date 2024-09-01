package loops;

import java.util.Scanner;

public class count_Digits {
	
	public static void countDigits(int n)
	{
		int count = 0;
		for(int i=0;i<n;i++)
		{
			int last = n%10;
			count ++;
			n = n/10;
		}
		System.out.println(count+1);
	}

	public static void main(String[] args) {
		
		/*
		 * write a program to count the number of digits present.
		 * input = 12345    output = 5
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		countDigits(n);

	}

}
