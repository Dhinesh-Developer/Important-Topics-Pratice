package Arrays_Pratice;

import java.util.Scanner;

public class Even_Present_In_Array {
	
	public static void EvenNumbers(int[] ar)
	{
		for(int i=1;i<=ar.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
			
		}
	}

	public static void main(String[] args) {

		/*
		 * write a program to print he even numbers present in the array.
		 * input = 5   1 4 6 3 10   o/p = 4 6 10
		 */
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=in.nextInt();
		}
		
		EvenNumbers(ar);
	}

}
