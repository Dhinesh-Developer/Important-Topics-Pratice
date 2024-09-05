package Arrays_Pratice;

import java.util.Scanner;

public class product_Array {
	
	public static int printProductOfArray(int[] ar)
	{
		int product = 1;
		for(int i=0;i<ar.length;i++)
		{
			product  = product * ar[i];
		}
		return product;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int []ar = new int[size];
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		
		int res= printProductOfArray(ar);
		System.out.println(res);
	}

}
