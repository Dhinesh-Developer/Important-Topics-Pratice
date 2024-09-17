package sorted_Array;

import java.util.Scanner;

public class program2 {
	
	public static void repeatedUniqueElements(int[] ar1,int[] ar2)
	{
		int i=ar1.length-1,j=0;
		while(i>=0 && j<ar2.length)
		{
			if(ar1[i] == ar2[j])
			{
				System.out.println(ar1[i]);
				i--;
				j++;
			}
			else if(ar1[i] > ar2[j])
			{
				i--;
			}
			else
			{
				j++;
			}
		}
	}
	

	public static void main(String[] args) {
		/*
		 * write a program to print the elements in the repeating element in the arrays.
		 * input = 6  9 8 7 6 5 4      5    4 5 6 7 8 
		 */
		
		Scanner in = new Scanner(System.in);
		int size1= in.nextInt();
		int[] ar1 = new int[size1];
		for(int i=0;i<ar1.length;i++)
		{
			ar1[i] = in.nextInt();
		}
		
		int size2 = in.nextInt();
		int[] ar2 = new int[size2];
		for(int i=0;i<ar2.length;i++)	
		{
			ar2[i] = in.nextInt();
		}
		
		repeatedUniqueElements(ar1,ar2);
	}

}
