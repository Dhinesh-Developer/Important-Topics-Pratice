package sorted_Array;

import java.util.Scanner;

public class unique1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int []ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		uniqueElement(ar);
	}

	public  static void uniqueElement(int[] ar) {
		
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i] != ar[i+1])
			{
				System.out.println(ar[i]);
			}
		}
		
	}

}
