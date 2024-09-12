package sorted_Array;

import java.util.Scanner;

public class Ascending_Order {
	// write a program to print the array element in ascending order.
	// input = 5   5 2 7 1 3      output = 1 2 3 5 7 
	
	public static void ascendingOrder(int[] ar) {

		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=0;j<ar.length-i-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;	
				}
			}
		}
		
		System.out.println("Ascending Order: ");
	    for(int i=0;i<ar.length;i++)
	    {
	    	System.out.print(ar[i] +" ");
	    }
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]  =in.nextInt();
		}
		ascendingOrder(ar);
	}
}
