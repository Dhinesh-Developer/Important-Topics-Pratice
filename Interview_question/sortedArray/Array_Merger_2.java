package sorted_Array;

import java.util.Scanner;

public class Array_Merger_2 {
	
	public static void arrayMerger(int[] ar1,int[] ar2,int[] ar3)
	{
		int size = ar1.length+ar2.length+ar3.length;
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
		for(int k=0;k<ar3.length;k++)
		{
			res[i++] = ar3[k];
		}
		for(int a=0;a<res.length;a++)
		{
			System.out.println(res[a]);
		}
	}
	
	public static void main(String[] args) {
		/*
		 * write a program to merge the three arrays.
		 * input = 3   1 2 3   4    4 5 6 7    2   8 9 
		 * output = 1 2 3 4 5 6 7 8 9
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
			ar2[i]=in.nextInt();
		}
		int size3 = in.nextInt();
		int[] ar3 = new int[size3];
		for(int i=0;i<ar3.length;i++)
		{
			ar3[i] = in.nextInt();
		}
		
		arrayMerger(ar1,ar2,ar3);
		
	}

}
