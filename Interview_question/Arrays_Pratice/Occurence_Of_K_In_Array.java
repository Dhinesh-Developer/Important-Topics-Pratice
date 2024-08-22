package Arrays_Pratice;

import java.util.Scanner;

public class Occurence_Of_K_In_Array {

	public static int OccurenceOfK(int[] ar,int k)
	{
		int count = 0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i] == k)
			{
				count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {

		/*
		 * write a program to print the occurrence of k in the array.
		 * input = 3 7 5 7 1    k= 7   output = 2
		 */
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();

		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		int k = in.nextInt();
	   int res = 	OccurenceOfK(ar,k);
	   System.out.println(res);

	}

}
