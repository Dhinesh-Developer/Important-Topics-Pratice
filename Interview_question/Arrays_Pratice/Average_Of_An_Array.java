package Arrays_Pratice;

import java.util.Scanner;

public class Average_Of_An_Array {

	public static int averageOfAnArray(int[] ar)
	{
		int avg = 0;
		int sum=0;
		for(int i=1;i<=ar.length;i++)
		{
			sum = sum+i;
			
		}
		return avg = sum/ar.length;
	}
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		int res = averageOfAnArray(ar);
		System.out.println(res);
	}

}
