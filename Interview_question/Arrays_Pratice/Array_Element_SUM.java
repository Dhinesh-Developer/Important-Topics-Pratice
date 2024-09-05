package Arrays_Pratice;

import java.util.Scanner;

public class Array_Element_SUM {
	public static int arraySum(int[] ar)
	{
		int sum = 0;
		for(int i=0;i<ar.length;i++)
		{
			sum = sum+ar[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		
		/*
		 * write a program to print the sum of the array.\
		 * input = 5    1 2 3 4 5    output = 15
		 */

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		int res = arraySum(ar);
		System.out.println(res);
				
	}

}
