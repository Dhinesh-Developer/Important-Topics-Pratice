package Array_Pair;

import java.util.Scanner;

public class pairs_With_Sum_as_Prime_Number {
	
	public static void primePairsNumbers(int ar[]) {
		for(int i=1;i<=ar.length;i++)
		{
			for(int j=1;j<=ar.length;j++)
			{
				if(ar[i]%i!=0 && ar[j]%j!=0)
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
		primePairsNumbers(ar);
	}

}
