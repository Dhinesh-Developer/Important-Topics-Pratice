package Array_Pair;

import java.util.Scanner;

public class Pairs_With_Sum_Less_Than_K {

	public static void method(int []ar,int k)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)	
			{
			  if(ar[i]+ar[j] < k )
			  {
				  System.out.println(ar[i]+" "+ar[j]);
			  }
			}
		}
	}
	public static void main(String[] args) {
		/*
		 * write a program to print the pairs with sum less than k.
		 * input =  6    2 4 6 3 8 9   10    2 4   2 6   2 3   4 3  6 3 
		 * 
		 * write a program to print the pairs with sum greater than k.
		 * input = 5  1 2 3 4 5    6      output = 1 5  2 4 
		 */

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		int k = in.nextInt();
	    method(ar,k);
	    method1(ar,k);
	}
	private static void method1(int[] ar, int k) {
		
	 for(int i=0;i<ar.length;i++)
	 {
		 for(int j=0;j<ar.length;j++)
		 {
			 if(ar[i]+ar[j] == k)
			 {
				 System.out.println(ar[i]+" "+ar[j]);
			 }
		 }
	 }
	}

}
