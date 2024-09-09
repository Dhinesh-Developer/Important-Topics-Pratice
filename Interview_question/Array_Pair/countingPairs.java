package Array_Pair;

import java.util.Scanner;

public class countingPairs {
	
	public static void countingPairs(int[] ar)
	{
		int count= 0 ;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				count ++;
				
				j++;
			}
			i++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		countingPairs(ar);
	}

}
