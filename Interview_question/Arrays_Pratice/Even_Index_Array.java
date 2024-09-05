package Arrays_Pratice;

import java.util.Scanner;

public class Even_Index_Array {
	
	public static void printEvenIndexArrayElement(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i] %2==0)
			{
				System.out.println(ar[i]);
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
		printEvenIndexArrayElement(ar);

	}

}
