package ArrayMerger;

import java.util.Scanner;

public class PROGRAM2 {
	
	public static void ArrayMergeringInAscendingOrder(int[] ar1,int[] ar2)
	{
		int [] ar3 = new int[ar1.length+ar2.length];
		for(int i=0;i<ar1.length;i++)
		{
			ar3[i] = ar1[i];
		}
		for(int i=0;i<ar2.length;i++)
		{
			ar3[ar1.length+i] = ar2[i];
		}
		
		for(int i=0;i<ar3.length;i++)
		{
			System.out.println(ar3[i]);
		}
	}

	public static void main(String[] args) {
		
		/*
		 * given a two sorted array.merge them into a single sorted array in ascending order.
		 * input = 3  1 2 3   3    4 5 6     output = 1 2 3 4 5 6
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
		ArrayMergeringInAscendingOrder(ar1,ar2);
	}

}
