package Arrays_Pratice;

import java.util.Scanner;

public class Smallest_Element_In_Array {

	public static void main(String[] args) {
		
		/*
		 * Write a program to find the smallest element in the array.
		 * input = 5   1 5 7 3 2    output 1
		 * input = 6   0 -1 -2 -3 -4 -5    output = -5
		 */

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		smallestElement(ar);
	}
	
	public static void smallestElement(int[] ar)
	{
		int smallest = ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i] < smallest)
			{
				smallest = ar[i];
			}
		}
		System.out.println(smallest);
	}

}
