package Arrays_Pratice;

import java.util.Scanner;

public class Find_Absolute_Sum {
	
	public static int absoluteSum(int[] ar)
	{
		int sum = 0;
		for(int i=0;i<ar.length;i++)
		{
			int av = ar[i];
			if(ar[i] < 0 )
			{
				av = -ar[i];
			}
			
				sum = sum +av;
			
		}
		return sum;
	}

	public static void main(String[] args) {
		/*
		 * write a program to find the absolute sum of all element present in the array.
		 * input = size = 5     5 -10 -15 -20 -25    output = 75
		 */

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		int res = absoluteSum(ar);
		System.out.println(res);
	}

}
