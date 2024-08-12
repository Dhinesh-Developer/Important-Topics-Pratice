import java.util.Scanner;

public class Product_Of_Three_numbers {
	
	static void product(int a,int b,int c)
	{
		int prod = a*b*c;
		System.out.println(prod);
	}

	public static void main(String[] args) {
	
		/*
		 * write a program to product of three numbers. 
		 * input = 1  2   3 output = 6
		 */
		
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		product(a,b,c);

	}

}
