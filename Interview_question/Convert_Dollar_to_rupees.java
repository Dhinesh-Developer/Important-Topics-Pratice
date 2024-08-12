import java.util.Scanner;

public class Convert_Dollar_to_rupees {
	
	public static void convertDollarToRupees(int dollars)
	{
		double rupee = dollars * 82.73;
		System.out.printf("%4f" , rupee);
	}

	public static void main(String[] args) {
		
		/*
		 * write a program to convert dollar to rupees.
		 * 1 dollar  = 82.73 INR
		 * input = 1000   output = 82730.0000
		 * 
		 */
		
		Scanner in = new Scanner(System.in);
		int dollars = in.nextInt();
		convertDollarToRupees(dollars);
	}

}
