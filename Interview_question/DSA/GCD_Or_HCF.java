package DSA;

import java.util.Scanner;

public class GCD_Or_HCF {
	
	public static void gcd(int a,int b)
	{
		while(a>0 && b>0)
		{
			if(a>b)
			{
				a = a%b;
			}
			else
			{
				b = b%a;
			}
		}
		if(a == 0)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(b);
		}
	}

	public static void main(String[] args) {
		/*
		 * write a program to print the gcd||hcf of the given two integer.
		 * input = 9   12    output = 3
		 */
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		gcd(a,b);
		


	}


}
