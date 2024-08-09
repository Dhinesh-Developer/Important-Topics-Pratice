import java.util.Scanner;

public class Convert_Lower_Case {
	
	static String convertLowerCase(String s)
	{
		String t ="";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			t = t +(char)(ch+32);
		}
		return t;
	}

	public static void main(String[] args) {
		
		/*
		 * Given a -String s. write a program to convert the string to lowercase.
		 * input = DHINESHKUMAR output = dhineshkumar
		 
		 */
		Scanner in = new Scanner(System.in);
		String s= in.next();
		String ConvertedString = convertLowerCase(s);
		System.out.println(ConvertedString);
	
	}

}
