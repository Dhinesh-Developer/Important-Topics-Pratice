package sorted_Array;

import java.util.Scanner;

public class program4 {
	
	public static void smallestOccurenceElements(int[] ar)
	{
		int count = 1;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i] == ar[i+1])
			{
				count++;
			}
			else {
				if(count == 1)
				{
					System.out.println(ar[i]+" - "+count);
				}
			}
		}
		System.out.println(ar[ar.length-1]);
		
	}

	public static void main(String[] args) {
		/*
		 * Write a program to print the occurences of smallest element
		 * in a sorted array.
		 * input = 8    1 2 3 4 4 4 5 
		 * output = 1-1   1-1   5-1
		 */
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		smallestOccurenceElements(ar);
	}

}
