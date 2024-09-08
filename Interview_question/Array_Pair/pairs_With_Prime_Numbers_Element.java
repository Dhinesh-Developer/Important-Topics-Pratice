package Array_Pair;

import java.util.Scanner;

public class pairs_With_Prime_Numbers_Element {
	
	public static void primeNumberElement(int ar[])
	{
		for(int i=2;i<ar.length;i++)
		{
			for(int j=2;j<ar.length;j++)
			{
				if(ar[i]%j!=0 && ar[j]%i!=0)
				{
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		/*
		 * write a program to print the pairs with prime number elements.
		 * input = 5   3 2 5 7 9    output = 2 3   2 5  2 7  3 5   3 7   5 7  5 5 ..
		 */
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		primeNumberElement(ar);
	}

}
