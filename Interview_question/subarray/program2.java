package com.dk.subarray;

import java.util.Scanner;

public class program2 {
	
	public static void subarray2(int []ar,int k)
	{
		
		for(int i=0;i<ar.length-k;i++)
		{
			int sum = 0;
			for(int j=i;j<i+k;j++)
			{
				sum = sum+ar[j];
			}
			System.out.println(sum);
			
		}
		
	}
	
	public static void main(String[] args) {
		/*
		 * given a array of n integers and an integer value size. Write a program to print the sum
		 * of all the subarrays of given length size.
		 * input = 9    5 1 2 4 9 3 1 3 3    3       output = 8  9  15  16  13  7  7
		 */
		
		Scanner in =  new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		int k = in.nextInt();
		subarray2(ar,k);
	}

}
