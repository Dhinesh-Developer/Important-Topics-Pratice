import java.util.Scanner;

public class Circle_Perimeter {
	
	public static void circleArea(int radius)
	{
		double b = 3.142 * radius* radius;
		System.out.printf("%2f" , b);
	}

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int radius = in.nextInt();
		circleArea(radius);
		

	}

}
