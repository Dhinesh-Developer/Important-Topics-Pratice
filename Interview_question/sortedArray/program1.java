package sorted_Array;

import java.util.Scanner;

public class program1 {
	
	public static void uniqueOddRepeatigElement(int[] ar1,int[] ar2)
	{
		// not a right method.
		int size = ar1.length+ar2.length;
		int res[] = new int[size];
		int i=0;
		for(;i<ar1.length;i++)
		{
			res[i] = ar1[i];
		}
		for(int j=0;j<ar2.length;j++)
		{
			res[i++] = ar2[j];
		}
		for(int k=0;k<res.length-1;i++)
		{
			if(res[i] == res[i+1] )
			{
				System.out.println(res[i]);
			}
		}
	}
	
	public static void method(int[] ar1,int[] ar2)
	{
	   int i=0,j=0;
	   while(i<ar1.length && j<ar2.length)
	   {
		   if(ar1[i] == ar2[j]) 
		   {
			   System.out.println(ar1[i]);
			   i++;
			   j++;
		   }
		   else if(ar1[i]>ar2[j])
		   {
			   j++;
		   }
		   else
		   {
			   i++;
		   }
	   }
	}

	public static void main(String[] args) {
		
		/*
		 * Given  a two sorted array of integer value. write a program to print the elements which are repeated
		 * in  both array.
		 * input = 5  1 5 6 8 9     7   2 3 4 6 7 8 9      output = 3 6 8 
		 */
		
		Scanner in = new Scanner(System.in);
		int size1 = in.nextInt();
		int []ar1 = new int[size1];
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
		
		//uniqueOddRepeatigElement(ar1,ar2);
		method(ar1, ar2);
		
	}

}
