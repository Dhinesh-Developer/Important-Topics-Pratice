package Arrays_Pratice;

import java.util.Scanner;

public class middle_To_End {
	
	public static void printAnArrayMiddleToEnd(int[] ar)
	{
		for(int i=ar.length/2;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}

	public static void main(String[] args) {
		/*
		 * write a program to print middle to end in an array.
		 * input = 6  1 2 3 4 5 6    output = 4 5 6 
		 */

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i]  = in.nextInt();
		}
		printAnArrayMiddleToEnd(ar);
	}

}
