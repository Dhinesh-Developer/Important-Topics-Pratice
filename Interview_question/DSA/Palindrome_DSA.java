package DSA;

import java.util.Scanner;

public class Palindrome_DSA {
	
	public static boolean checkPalindrome(int n)
	{
		int duplicate = n;
		int lastDigit = 0;
		int revNumber = 0;
		while(n>0)
		{
			lastDigit = n%10;
			revNumber = (revNumber*10)+lastDigit;
			n = n/10;
		}
		if(revNumber == duplicate)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		
		/*
		 * Write a program to check whether the given a given nu8mber is palindrome or not.
		 * input = 121   output= true
		 */

		Scanner in =new Scanner(System.in);
		int n = in.nextInt();
		boolean res = checkPalindrome(n);
		System.out.println(res);
		
		
	}

}
