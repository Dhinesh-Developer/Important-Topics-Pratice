package If_Else;

import java.util.Scanner;

public class Divisible_ByFour_check {
	
	public static void check(int numbers)
	{
		if(numbers % 4==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("NO");
		}
	}

	public static void main(String[] args) {

// write a program to check the number is divisible by four or not
    
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		check(number);
		in.close();
	}

}
