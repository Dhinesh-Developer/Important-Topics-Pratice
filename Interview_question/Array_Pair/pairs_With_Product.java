package Array_Pair;

import java.util.Scanner;

public class pairs_With_Product {
	
	public static void pairsWithProduct(int ar[],int k)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if(ar[i]*ar[j] == k)
				{
					System.out.print(ar[i] +" "+ar[j]+"   ");
				}
			}
		}
	}

	public static void main(String[] args) {
		/*
		 * write a program to print the pairs with product.
		 * input = size=6  ar= [2,4,6,3,8,9] k=12    output= 2 6   4 3   6 2   3 4  
		 */
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		int k = in.nextInt();
		pairsWithProduct(ar,k);
	}

}
