package DSA;

import java.util.Scanner;

public class REVERSE_NUMBER {
	
	public static int  ReverseNumber(int n)
	{
		int duplicate = n;
		int lastDigit = 0;
		int revNum = 0;
		while(n>0)
		{
			lastDigit = n%10;
			 revNum = (revNum * 10)+lastDigit;
			n = n/10;
		}
		return revNum;
	}

	public static void main(String[] args) {
		
		/*DSA  
		 * Write a program to Reverse a number.
		 * input = 1234    output = 4321
		 */
    
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int res = ReverseNumber(n);
		System.out.println(res);
		
	
	}

}
