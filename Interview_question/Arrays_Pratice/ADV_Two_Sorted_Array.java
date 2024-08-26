package Arrays_Pratice;

import java.util.Scanner;

public class ADV_Two_Sorted_Array {
	
	

	public static void main(String[] args) {
     
	/*
	 * Given  a two sorted array of integer value.Write a program to print the elements which are repeated in both the array.
	 * input = size1 = 5      3 5 6 8 9 
	 * input  =  size2 = 7     2 3 4 6 7 8 8        
	 * output = 3 6 8	
	 */
		
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int[] ar1 = new int[n1];
		for(int i = 0;i<ar1.length;i++)
		{
			ar1[i] = in.nextInt();
		}
		
		int n2 = in.nextInt();
		int[] ar2 = new int[n2];
		
		for(int i=0;i<ar2.length;i++)
		{
		     ar2[i] = in.nextInt();	
		}
		
		
		printCommonElement(ar1,ar2);
		
	}

	private static void printCommonElement(int[] ar1, int[] ar2) 
	{
		int i=0,j=0;
		while(i<ar1.length && j<ar2.length)
		{
			if(ar1[i] == ar2[j])
			{
				System.out.println(ar1[i]);
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

}
