package Arrays_Pratice;

import java.util.Scanner;

public class ElementsPresentArray {
	
	public static void ElementPresentInEvenIndex(int[] ar) 
	{
		for(int i=0;i<ar.length;i++)
		{
			if(i %2==0)
			{
				System.out.println(ar[i]);
			}
		}
	}
	
	
	public static void ElementPresentInOddIndex(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{ 
			if(i % 2 !=0)
			{
				System.out.println(ar[i]);
			}
		}
	}

	public static void main(String[] args) {
	
		Scanner in =new Scanner(System.in);
		
		/*
		 * write a program to print the element present in even index.
		 * input = 1 2 3 4 5  output = 1 3 5 
		 */
		
		/*
		 * write a program to print the element present in odd index.
		 * input = 1 2 3 4 5  output = 1 3 5
		 */
		
		
		
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
	  //  ElementPresentInEvenIndex(ar);	
	    
	    
	    ElementPresentInOddIndex(ar);
	    
	
	}

}
