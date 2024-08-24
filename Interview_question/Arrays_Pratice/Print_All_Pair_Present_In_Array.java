package Arrays_Pratice;

import java.util.Scanner;

public class Print_All_Pair_Present_In_Array {
	
	
	public static void printAllPair(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i;j<ar.length;j++)
			{
				System.out.println(ar[i]+" "+ar[j]);
			}
		}
	}

	public static void main(String[] args) {
		
		/*
		 * givena a array.write a program to print all the pairs present in the array.
		 *input = 
		 *  size = 3
1 2 3 //  array
output all possible pair.
1 1
1 2
1 3
2 2
2 3
3 3
		 */
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		
		printAllPair(ar);

	}

}
