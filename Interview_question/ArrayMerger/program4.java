package ArrayMerger;

import java.util.Scanner;

public class program4 {

	public static void descendingSortedArray(int[] ar1,int[] ar2)
	{
		int[] mergedArray = new int[ar1.length+ar2.length];
		for(int i=0;i<ar1.length;i++)
		{
			mergedArray[i] = ar1[i];
		}
		for(int i=0;i<ar2.length;i++)
		{
			mergedArray[ar1.length+i] = ar2[i];
		}
		
		// bubble sort
		for(int i=0;i<mergedArray.length-1;i++)
		{
			for(int j=0;j<mergedArray.length-i-1;j++)
			{
				if(mergedArray[j] > mergedArray[j+1])
				{
					int temp = mergedArray[j];
					mergedArray[j] = mergedArray[j+1];
					mergedArray[j+1] = temp;
					
				}
			}
		}
		
		for(int i=mergedArray.length-1;i>=0;i--)
		{
			System.out.println(mergedArray[i]);
		}
	}

	public static void main(String[] args) {
		/*
		 * Given a two sorted array ,merge them into a single sorted array in descending order.
		 * input   =    3     1 3 5     3     2 4 6       output = 6 5 4 3 2 1 
		 */
		
		Scanner in = new Scanner(System.in);
		int size1 = in.nextInt();
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
		descendingSortedArray(ar1,ar2);
	}


}
