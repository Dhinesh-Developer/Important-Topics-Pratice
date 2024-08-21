package Arrays_Pratice;

import java.util.Scanner;

public class Largest_Element_Index_in_Array {
	
	public static int largestElementIndex(int[] ar)
	{
		int max=0,index=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i] > max)
			{
				max = ar[i];
				index = i;
			}
		}
		return index;
		
	}

	public static void main(String[] args) {

		/*
		 * write a program to print the largest element in the array.
		 * input = 3 5 2 7 4      output = 7
		 */

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		
	    int[] ar = new int[size];
	    
	    for(int i=0;i<ar.length;i++)
	    {
	    	ar[i] = in.nextInt();
	    }
	  
	    int largestIndex = largestElementIndex(ar);
	    System.out.println(largestIndex);

	
	}

}
