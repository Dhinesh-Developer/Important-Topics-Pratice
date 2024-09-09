package Array_Pair;

import java.util.Scanner;

public class evenPairs {
	
	public static void evenPairs(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if(ar[i]%2==0 && ar[j]%2==0)
				{
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}

		
		evenPairs(ar);
	}

}
