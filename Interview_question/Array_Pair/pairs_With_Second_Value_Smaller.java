package Array_Pair;

import java.util.Scanner;

public class pairs_With_Second_Value_Smaller {

	public static void main(String[] args) {
		
		/*
		 * write a program to print the paies with second value smaller. second value strictly larger than first value.
		 * input = 5  4 9 2 7 5    output = 4 9   4 7   4 5   2 7   2 5...
		 */
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		method(ar);
	}

	public  static void method(int[] ar) {
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if(ar[j] > ar[i])
				{
					System.out.println(ar[i] +" "+ar[j]);
				}
			}
		}
		
	}

}
