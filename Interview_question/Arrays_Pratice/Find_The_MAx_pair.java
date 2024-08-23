package Arrays_Pratice;

import java.util.Scanner;

public class Find_The_MAx_pair {
	
	static int Find_Max_Pair(int []ar)
	{
		int largest = ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i] > largest)
			{
				largest = ar[i];
			}
		}
		
		int sLargest = -1;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>sLargest && ar[i] != largest)
			{
				sLargest = ar[i];
			}
		}
		
		int maxPair = largest + sLargest;
		return maxPair;
	}

	public static void main(String[] args) {
		/*
		 * write a program to print the max pair in the array.
		 * input = 5     3 4 5 7 9    output = 16
		 */
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i] =in.nextInt();
		}
		int res = Find_Max_Pair(ar);
		System.out.println(res);
		

	}

}
