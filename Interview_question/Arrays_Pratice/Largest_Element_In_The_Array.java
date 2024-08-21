package Arrays_Pratice;

import java.util.Scanner;

public class Largest_Element_In_The_Array {
	
	public static int largestElement(int[] ar)
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
	  
	    int largest = largestElement(ar);
	    System.out.println(largest);

	}

}
