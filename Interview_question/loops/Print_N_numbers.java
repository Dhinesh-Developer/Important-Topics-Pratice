package loops;

import java.util.Scanner;

public class Print_N_numbers {
	public static void printNnumbers(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		/*
		 * write a program to print n numbers using loops.
		 * input = 5   output = 12345
		 */
 
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		printNnumbers(n);
	}

}
