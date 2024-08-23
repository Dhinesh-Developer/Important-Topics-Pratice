package Arrays_Pratice;

import java.util.Scanner;

public class Second_Largest_Element_In_Array {
	




	public static int secondLargestElement(int[] ar)
	{
		int largest = ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i] > largest)
			{
				largest  = ar[i];
			}
		}
		
		
		int sLargest = -1;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i] > sLargest && ar[i] !=largest)
			{
				sLargest = ar[i];
			}
		}
		return sLargest;
		
	}
	


	public static void main(String[] args) {
		
		/*
		 * Given an array of n integer. write a program to print the second largest element in the array.
		 * input  = size = 7      i/p = =   3 5 4 7 6 10 8     output = 8
		 */

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		
		for(int i = 0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
			
		}
		int res = secondLargestElement(ar);
		System.out.println(res);
		

	}

}
