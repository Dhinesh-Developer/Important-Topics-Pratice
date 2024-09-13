package sorted_Array;

import java.util.Scanner;

public class ArrayMerger {

	public static void mergeArray(int[] ar1,int[] ar2)
	{
		int size = ar1.length+ar2.length;
		 int[] res = new int[size];
		 
		 int i=0;
		for(;i<ar1.length;i++)
		{
		   res[i] = ar1[i];
		}
		for(int j=0;j<ar2.length;j++)
		{
			res[i++] = ar2[j];
		}
		for(int k=0;k<res.length;k++)
		{
			System.out.println(res[k]);
		}
	}
	
	public static void main(String[] args) {
		/*
		 * write a program to merge the two array and print in the ascending order.\
		 * input  = 3   1 2 3    4    4 5 6 7     output = 1 2 3 4 5 6 7 
		 */
		
		Scanner in = new Scanner(System.in);
		int size1 = in.nextInt();
		int[] ar1 = new int[size1];
		
		for(int i=0;i<ar1.length;i++)
		{
			ar1[i] = in.nextInt();
			
		}
		int size2 = in.nextInt();
		int[] ar2  =new int[size2];
		for(int i=0;i<ar2.length;i++)
		{
			ar2[i] = in.nextInt();
		}
		mergeArray(ar1,ar2);
	}

}
