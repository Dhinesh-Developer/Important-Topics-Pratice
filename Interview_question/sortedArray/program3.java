package sorted_Array;

import java.util.Scanner;

public class program3 {
	
	public static void occurenceCountElements(int[] ar)
	{
		int count = 1;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i] == ar[i+1])
			{
				count++;
			}
			else
			{
				System.out.println(ar[i]+" - "+count);
				count = 1;
			}
		}
		System.out.println(ar[ar.length-1]+" - "+count);
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		occurenceCountElements(ar);
	}

}
