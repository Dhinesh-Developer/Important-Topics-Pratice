package Arrays_Pratice;

import java.util.Scanner;

public class Sorted_Array_Occurence {
	
	public static void PrintOccurenceOfEachElement(int []ar)
	{
		int count = 1;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i] == ar[i+1])
			{
				count++;
			}
			else
			{
				System.out.println(ar[i]+"-"+count);
				count = 1;
			}
			
		}
		System.out.println(ar[ar.length-1]+"-"+count);
	}

	public static void main(String[] args) {
		
		/*
		 * Given a sorted array of n integers.Write a program to print the occurrence of each element present in the array/. 
		 * input size = 5     ar =  [1 ,1, 2, 2, 3 ]     output = 1-2,2-2,3-1 how many times the element present in the array.
		 */
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int []ar = new int[size];
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		PrintOccurenceOfEachElement(ar);

	}

}
