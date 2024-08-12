import java.util.Scanner;

public class Rectangle_Perimeter {
	
	static void perimeter(int length,int width)
	{
		int peri = 2*(length + width);
		System.out.println(peri);
	}

	public static void main(String[] args) {
		
		/*
		 * write a program to rectangle perimeter .
		 * formula  = perimeter  = 2*(length+width)
		 * input = 2 4 output = 12
		 */
		
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int width = in.nextInt();
		perimeter(length,width);
	}

}
