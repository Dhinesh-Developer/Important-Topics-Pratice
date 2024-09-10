package Array_Pair;

import java.util.Scanner;

public class pairs_With_difference_K {
	
	public static void method(int ar[],int k)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if(ar[i]-ar[j]==k)
				{
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 * write a program to print the pairs with difference k.\
		 * input = 5    3 1 5 4 2   2     output= 3 1  3 5  4 2 
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
	}

}
