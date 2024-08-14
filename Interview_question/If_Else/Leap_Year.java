package If_Else;

import java.util.Scanner;

public class Leap_Year {
	public static String CheckLeapYear(int year) {
		if((year % 4==0 || year %400==0) && year %100 !=0)
		{
			return "Yes";
		}
		else {
			return "No";
			
		}
	
	}

	public static void main(String[] args) {
	
		// check the given year is leap year or not
		
		Scanner in = new Scanner(System.in);
		int year  = in.nextInt();
		String res = CheckLeapYear(year);
		System.out.println(res);
	}

}
