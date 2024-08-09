import java.util.Scanner;

public class Covert_Upper_Case {
	
	static String convertUpperCase(String s)
	{
		String t = "";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			t = t+ (char)(ch-32);
		}
		return t;
	}

	public static void main(String[] args) {


		
		/*
		 * Given a -String s. write a program to convert the string to upper case.
		 * input = dhineshkumar output = DHINESHKUMAR
		 
		 */
		Scanner in = new Scanner(System.in);
		String s= in.next();
		String ConvertedString = convertUpperCase(s);
		System.out.println(ConvertedString);

	}

}
