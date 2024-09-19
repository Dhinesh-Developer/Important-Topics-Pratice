package sorted_Array;

import java.util.Scanner;

public class program5 {
	
	public static void countKValuesOccurences(int[] ar,int k)
	{
		int count = 0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i] == k)
			{
				count++;
			}
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
		int k = in.nextInt();
		countKValuesOccurences(ar,k);
	}

}
