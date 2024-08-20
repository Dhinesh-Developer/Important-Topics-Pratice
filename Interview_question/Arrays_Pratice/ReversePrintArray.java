package Arrays_Pratice;

import java.util.Scanner;

class reverseArray{
	void PrintArray(int[] ar)  // print the array in ascending order
	{
		for(int x : ar) {
			System.out.print(x);
		}
	}
	void ReverseArray(int[] ar)  // print the array in descending order.
	{
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
	}
	void halfArray(int[] ar)
	{
		for(int i=0;i<ar.length/2;i++)
		{
			System.out.println(ar[i]);
		}
	}
}

public class ReversePrintArray {

	public static void main(String[] args) {
		
		/*
		 * write a program to print the array in reverse order.
		 * input = 5     1 2 3 4 5     output = 5 4 3 2 1 
		 */
		
	Scanner in = new Scanner(System.in);
	reverseArray ra = new reverseArray();
	
	int size = in.nextInt();
	int[] ar = new int[size];
	
	for(int i=0;i<ar.length;i++)
	{
		ar[i] = in.nextInt();
	}
	
	ra.ReverseArray(ar);
	ra.halfArray(ar);
		
	}

}
