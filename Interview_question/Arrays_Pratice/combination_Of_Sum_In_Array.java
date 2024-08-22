package Arrays_Pratice;

import java.util.Scanner;

public class combination_Of_Sum_In_Array {
	
	public static int largest(int []ar)
	{
		int largest = ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i] > largest)
			{
				largest = ar[i];
			}
		}
		return largest;
	}
	
	public static int smallest(int []ar)
	{
		int smallest = ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i] < smallest)
			{
				smallest = ar[i];
			}
		}
		return smallest;
	}
	
	public static int  sum(int []ar)
	{
		int sum = 0;
		for(int i=0;i<ar.length;i++)
		{
			sum = sum+ar[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		
		/*
		 * write a program to find the max and min , combination of 4 digits out of 5 digits, print 
		 * the max and min,
		 * input = size = 5   ar = 1 2 3 4 5     output = 10//max  14//min
		 */

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		int max = largest(ar);
		int min = smallest(ar);
		int sum = sum(ar);
		System.out.println(sum-max);
		System.out.println(sum-min);

	}

}
