package Arrays_Pratice;

import java.util.Scanner;

public class print_From_Middle {
	
	public static void printAnArrayFromMiddle(int[] ar)
	{
		for(int i=0;i<ar.length/2;i++)
		{
			System.out.println(ar[i]);
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		printAnArrayFromMiddle(ar);
		
		
		
	}

}
