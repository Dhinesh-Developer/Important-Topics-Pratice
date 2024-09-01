package loops;

import java.util.Scanner;

class countFactors
{
	
 public int count(int n)
	{
		int count = 0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		return count;
	}
}

public class count_Factors {
	/*
	 * write a program to count the number of factors in the N.
	 * input = 20   output = 6
	 */

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		countFactors c = new countFactors();
		int res = c.count(n);
		System.out.println(res);
		
	}

}
