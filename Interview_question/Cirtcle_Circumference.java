import java.util.Scanner;

public class Cirtcle_Circumference {
	
	public static void circleCircumference(int radius)
	{
		double circum = 2*3.142*radius;
		System.out.printf("%2f",circum);
	}

	public static void main(String[] args) {
		
		/*
		 * Given a circumference variale.write a program to calculate the circumference of the circle.
		 * input  = 10 output = 62.8400
		 * formula  = 2*pi*radius
		 */
		
		Scanner in = new Scanner(System.in);
		int radius = in.nextInt();
		circleCircumference(radius);
	
	}

}
