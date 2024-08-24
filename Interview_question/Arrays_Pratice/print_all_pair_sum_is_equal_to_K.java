package Arrays_Pratice;

import java.util.Scanner;

public class print_all_pair_sum_is_equal_to_K {
	
	public static void printPairSumEqualToK(int[] ar,int k)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i;j<ar.length;j++)
			{
				if(ar[i]+ar[j] == k)
				{
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		
		/*
		 * write a program to print all the pairs present in the array whose sum is equal to K.
		 * input   size = 5    ar = 3 4 1 2 5      k = 6      output = 3 3     4 2    1 5 
		 * printing the possible pairs of array whose sum is equal to k.
		 */
	
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
	    int[] ar = new int[size];
	    for(int i=-0;i<ar.length;i++)
	    {
	    	ar[i] = in.nextInt();
	    }
	    int k = in.nextInt();
	    printPairSumEqualToK(ar,k);
	}

}
