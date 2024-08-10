import java.util.Scanner;

public class Swap_Case {
	
	public static String swapCaseString(String s)
	{
		String t = "";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				t = t + (char) (ch+32);
			}
			else if(ch>='a' && ch<='z')
			{
				t = t + (char) (ch-32);
			}
			else {
				t = t+ch;
			}
		}
		return t;
	}

	public static void main(String[] args) {
		
		/*
		 * given a STring s.write a program to swap the case if in uppercase change to
		 * lowercase ortherwise lowercase means to cahnge to uppercase
		 * 
		 * input DHINESH kumar 3369  output = dhinesh KUMAR 3369
		 */

		
		Scanner in = new Scanner(System.in);
		String s =in.nextLine();
		String res = swapCaseString(s);
		System.out.println(res);
	}

}
