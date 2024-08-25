package Arrays_Pratice;

import java.util.Scanner;

public class Unique_Elements_present_In_Array {
	
	public static void UniqueElementsPresent(int[] ar)
	{
		int count =1;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i] == ar[i+1])
			{
				count++;
			}
			else
			{
				if(count == 1)
				{
					System.out.println(ar[i]);
					//count = 1;
				}
				count = 1;
			}
		}
	if(count ==1)
	{
		System.out.println(ar[ar.length-1]);
	}
	}
	
	

	public static void main(String[] args) {
		
		/*
		 * given a sorted array of n integers. Write a program to print all the unique elements present in the array.
		 * 
		 * input   8      2 2 2 3 4 4 4 23    output = 3 23

		 */
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
			
		}
		
        UniqueElementsPresent(ar);
		

	}

}
