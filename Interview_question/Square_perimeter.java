import java.util.Scanner;

public class Square_perimeter {
	
	static void perimeter(int side)
	{
		int peri = 4 * side;
		System.out.println(peri);
	}

	public static void main(String[] args) {

		/*
		 * write a program to square perimeter .
		 * perimeter = 4*side
		 * input = 10  output = 40
		 */
		Scanner in = new Scanner(System.in);
		int side = in.nextInt();
		perimeter(side);
		
	}

}
