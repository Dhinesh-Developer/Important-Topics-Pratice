package Array_Pair;

import java.util.Scanner;

public class pair_With_Sum_Greater_Than_K {
	
	public static void pairSumGreaterThanK(int[] ar,int k)
	{
		for(int i = 0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if(ar[i]+ar[j] > k)
				{
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		
		/*
		 * given a array size , array value and kth value, write a program to print the sum of pair greater than k value.
		 * input = sizw =7
		 * 2 4 6 3 8 9      k = 7
		 * output = 2 6   2 8  2 9  4 6 ......
		 */

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		int k = in.nextInt();
		pairSumGreaterThanK(ar,k);
		
	}

}
