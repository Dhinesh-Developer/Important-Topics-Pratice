package sorted_Array;

import java.util.Scanner;

public class repeated_Even_elements {
	
	public static void evenRepeatedElements(int[] ar1,int[] ar2)
	{
		int i=0,j=0;
		while(i<ar1.length && j<ar2.length)
		{
			if(ar1[i] == ar2[j])
			{
				if(ar1[i]%2==0)
				{
					System.out.println(ar1[i]);
				}
				i++;
				j++;
			}
				else if(ar1[i] > ar2[j])
				{
					j++;
				}
				else
				{
					i++;
				}
			
		}
	}

	public static void main(String[] args) {
		/*
		 * given a two sorted array.write a program to printing the repeating even elements present in both 
		 * two arrays.
		 * input = 7   2 4 5 6 8 10 12       6      4 6 6 8 10 12       output = 4 6 8 10 12
		 */

		Scanner in = new Scanner(System.in);
		int size1= in.nextInt();
		int[] ar1 = new int[size1];
		for(int i=0;i<ar1.length;i++)
		{
			ar1[i] = in.nextInt();
		}
		int size2 = in.nextInt();
		int[] ar2 = new int[size2];
		for(int i=0;i<ar2.length;i++)
		{
			ar2[i] = in.nextInt();
		}
	    evenRepeatedElements(ar1,ar2);
		
	}

}
