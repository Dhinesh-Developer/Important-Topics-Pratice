package ArrayMerger;

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int size1 = in.nextInt();
		int[] ar1 = new int[size1];
		for(int i=0;i<ar1.length;i++)
		{
			ar1[i] = in.nextInt();
		}
		int size2 = in.nextInt();
		int[] ar2 = new int[size2];
		for(int i=0;i<ar2.length;i++)
		{
			ar2[i] = in.nextInt();
		}
		
		ArrayMergeringInAscendindOrder(ar1,ar2);
		
	}

	public  static void ArrayMergeringInAscendindOrder(int[] ar1, int[] ar2) {
		
	int[] res = new int[ar1.length+ar2.length];
	int i=0,k=0;
	while(k<res.length)
	{
		if(i<ar1.length)
		{
			res[k++] = ar1[i];
		}
		if(i<ar2.length)
		{
			res[k++] = ar2[i];
		}
		i++;
	}
	for(int j=0;j<res.length;j++)
	{
		System.out.println(res[j]);
	}
	}

}
