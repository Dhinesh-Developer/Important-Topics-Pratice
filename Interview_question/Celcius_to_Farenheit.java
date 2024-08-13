import java.util.Scanner;

public class Celcius_to_Farenheit {
	public static void ConvertToFarenheit(int celsius)
	{
		double farenheit = (celsius*9/5)+32;
		System.out.printf("%2f",farenheit);
	}

	public static void main(String[] args) {
		
		/*
		 * write a program to convert celsius to farenheit
		 * input = 12 output =53.6
		 */
		Scanner in = new Scanner(System.in);
		int celsius  = in.nextInt();
		
		ConvertToFarenheit(celsius);
	}

}
