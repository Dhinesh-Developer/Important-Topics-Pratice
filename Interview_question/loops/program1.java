package subarray;

import java.util.Scanner;

public class program1 {
	
	public static void subarray1(int ar[],int subarraySize)
	{
		for(int i=0;i<ar.length-subarraySize;i++)
		{
			for(int j=i;j<i+subarraySize;j++)
			{
				System.out.println(ar[j]);
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		/*
		 * given a array of n integers.an an integer  value size.write a program to print the all the subarrays of given length size.
		 * input = 
		 */
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		int subarraySize = in.nextInt();
		subarray1(ar,subarraySize);
	}

}
