package loops;

import java.util.Scanner;

public class Firat_N_Even_Numbers {
	public static void FirstNEvenNumber(int n)
	{
			for(int i=1;i<=n*2;i++)
			{
				if(i%2==0)
				{
					System.out.println(i);
				}
			}
		
	}

	public static void main(String[] args) {
		/*
		 * write a program to print the First Even numbers from N.
		 * input = 5    output = 2 4 6 8 10 
		 */
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		FirstNEvenNumber(n);

	}

}
