package Array_Pair;

import java.util.Scanner;

public class pairs_With_Second_Value_smaller_Than_First_Value {
	
	public static void method(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if(ar[i] > ar[j])
				{
					System.out.print(ar[i]+" "+ar[j] +"   ");
				}
			}
		}
	}

	public static void main(String[] args) {
		/*
		 * write a program to print pairs with second value smaller than the first value.secoond
		 * value strictly smaller than the first value.
		 * input = 5    3 1 5 4 2     output= 5    3 1   3 2   5 3   5 1   5 4   5 2   4 3   4 1   4 2   2 1  

		 */
		
		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		method(ar);
	}

}
