import java.util.Scanner;

public class Print_All_Sub_String {
	
	public static void printAllSubString(String s)
	{
		int size;
		for(size=1 ; size<=s.length();size++)
		{
			for(int i=0;i<s.length()-size;i++)
			{
				String t = "";
				for(int j=i;j<size+i;j++)
				{
					t = t+s.charAt(j);
				}
				System.out.println(t);
			}
		}
	}

	public static void main(String[] args) {
     
		/*
		 * Given a string s.write a program to print all the subString.
		 * input = dhinesh
		 * output =d  h  i  n  e  s  h  di  in  ne .........dhinesh
		 */

		Scanner in =new Scanner(System.in);
		String s = in.next();
		printAllSubString(s);

	}

}
