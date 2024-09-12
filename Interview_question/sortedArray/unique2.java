package sorted_Array;

import java.util.Scanner;

public class unique2 {
	
	public static void uniqueElements(int[] ar)
	{
		int count = 1;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]==ar[i+1])
			{
				count ++;
			}
			else {
				if(count ==1)
				{
					System.out.println(ar[i]);
					
				}
				count = 1;
			}
		}
		if(count ==1)
		{
			System.out.println(ar[ar.length-1]);
		}
	}

	public static void main(String[] args) {
		/*
		 * write a program to print the unique elements present in the array.
		 * input = size =10   ar[1,2,2,3,3,4,5,5,5,6]    output = 1,4 6
	        	 */
		
		Scanner in = new Scanner (System.in);
		
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		} 
		uniqueElements(ar);
	}

}
