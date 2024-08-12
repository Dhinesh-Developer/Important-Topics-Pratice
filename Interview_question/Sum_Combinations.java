import java.util.Scanner;

public class Sum_Combinations {
	
	static void sumCombinations(int a,int b,int c)
	{
		System.out.println(a+b);
		System.out.println(b+c);
		System.out.println(a+c);
	}

	public static void main(String[] args) {
		
		/*
		 * write a program to print all the possible sum combinations,taking two numbers
		 * input = 2 4 6 output = 6 8 10 
		 */

		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		sumCombinations( a, b, c);

	}

}
