package Arrays_Pratice;

import java.util.Scanner;

public class index_Of_K_In_The_Array {

	public static void indexOfK(int[] ar,int k)
	{
		int index = 0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i] == k)
			{
				index = i;
			}
		}
		System.out.println(index);
	}
	public static void main(String[] args) {
		
		/*
		 * given a array .
		 * write a program to print the index of k in the array.
		 * input = size = 7     ar = 3 2 1 7 5 1 9 4    k=5  output = 4
		 */
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		int k = in.nextInt();
		indexOfK(ar,k);

	}

}
