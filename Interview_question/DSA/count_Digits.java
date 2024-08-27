package DSA;

import java.util.Scanner;

public class count_Digits {
	
	// Time complexity O(log10(n))

	public static int countDigits(int N)
	{
		int count = 0;
		int lastDigit;
		while(N>0)
		{
			lastDigit = N%10;
			count++;
			N = N/10;
		}
		return count;
		
	}


	public static void main(String[] args) {
      
		
		/*
		 * write a program to print the count the digits.
		 * clue = Extracting the number
		 * input = 7789   output = 4
		 * 
		 */
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int res = countDigits(N);
		System.out.println(res);
	}

}
