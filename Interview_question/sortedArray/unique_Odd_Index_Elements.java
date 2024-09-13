package sorted_Array;

import java.util.Scanner;

public class unique_Odd_Index_Elements {
	
	public static void uniqueOddIndexElements(int[] ar)
	{
		for(int i=1;i<=ar.length-1;i=i+2)
		{
			System.out.println(ar[i]);
			
		}
	}
	public static void uniqueEvenIndexElements(int[] ar)
	{
		int count = 1;
		
		for(int i=1;i<=ar.length-i-1;i=i+2)
		{
			if(ar[i] == ar[i+1])
			{
				count ++;
			}
			else
			{
				if(count ==1)
				{
						System.out.println(ar[i]);
				}
			}
			
		}
	}

	public static void main(String[] args) {
		/*
		 * write a program to print the unique odd index elements.
		 * input= 10   1 2 3 4 5 6 7 8 9     output = 2 4 6 8 
		 */
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		//uniqueOddIndexElements(ar);
		uniqueEvenIndexElements(ar);
	}

}
