package sorted_Array;

import java.util.Scanner;

public class program6 {
	
	public static void largestRepeatingElement(int[] ar)
	{
		
		for(int i=0;i<ar.length/2-1;i++)
		{
			if(ar[i] == ar[i+1])
			{
				System.out.println(ar[i]);
			}
			

		}
	}

	public static void main(String[] args) {
		
		Scanner in  =new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		largestRepeatingElement(ar);
	}

}
