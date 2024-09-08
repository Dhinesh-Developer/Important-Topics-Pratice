package Array_Pair;

import java.util.Scanner;

public class pairs_With_First_Value_Smaller {
	
	public static void method(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if(ar[i] < ar[j])
				{
					System.out.println(ar[i] +" "+ar[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		/*
		 * Write a program to print the pairs with first value strictly smaller than the second value.
		 * input = 5    3 1 5 4 2      output =  3 5   3 4   1 5   1 4   1 2 ...
		 */
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		method(ar);
	}

}
