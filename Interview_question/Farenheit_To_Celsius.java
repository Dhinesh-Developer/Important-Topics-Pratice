import java.util.Scanner;

public class Farenheit_To_Celsius {
	
	static double convertToCelsius (int Farenheit)
	{
		double celsius = (Farenheit -32)*5/9;
		return celsius;
	}

	public static void main(String[] args) {
		
		/*
		 * write a program to convert farenheit to celsius
		 * input = 68 output =20.0000
		 */
		Scanner in = new Scanner(System.in);
		int Farenheit  = in.nextInt();
		
		double res= convertToCelsius(Farenheit);
		System.out.println(res);
	}

}
