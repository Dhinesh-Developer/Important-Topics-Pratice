package Arrays_Pratice;

import java.util.Scanner;

public class Odd_Index_Array {
	public static void printOddIndexArrayElement(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i] % 2!=0)
			{
				System.out.println(ar[i]);
			}
		}
	}

	public static void main(String[] args) {
		/*
		 * write a program to print the odd elements present in the array.
		 * input= 3    1 2 3      output = 1 3
		 */
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		
		for(int i = 0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		
		printOddIndexArrayElement(ar);
	}

}
