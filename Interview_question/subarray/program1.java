package com.dk.subarray;

import java.util.Scanner;

public class program1 {
	
	public static void subarray1(int[] ar,int k)
	{
		for(int i=0;i<ar.length-k;i++)
		{
			for(int j=i;j<i+k;j++)
			{
				System.out.print(ar[j]+" ");
			}
			System.out.println();
		}
	
		
	}

	public static void main(String[] args) {
		/*
		 * given a array of n integers and an integer value size.write a program to print all the subarray of given
		 * length size.
		 * input = 9     5 1 2 4 9 3 1 3 3     3     
		 * 
		 * output:
		5 1 2 
		1 2 4 
		2 4 9 
		4 9 3 
	 	9 3 1 
		3 1 3 

		 */
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		int k = in.nextInt();
		subarray1(ar,k);
	}

}
