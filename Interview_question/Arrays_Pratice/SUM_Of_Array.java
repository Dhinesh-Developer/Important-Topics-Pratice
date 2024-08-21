package Arrays_Pratice;

import java.util.Scanner;



public class SUM_Of_Array {
	
	public static int SumOfAllElements(int[] ar)
	{
		int sum = 0;
		for(int i=0;i<ar.length;i++)
		{
			sum = sum + ar[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		
		
		/*
		 * write a program to print the sum of all elements present in the array.
		 * input: 1 2 3 4 5     output = 15
		 * size = 5
		 */

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
					
		}
		int res = SumOfAllElements(ar);
		System.out.println(res);
		
	}

}
