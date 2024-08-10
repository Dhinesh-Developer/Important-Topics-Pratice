import java.util.Scanner;

public class Trim_String_2 {
	
	public static String trim(String s)
	{
		int si=0 , ei=0;  // si = starting index ei = ending index
		
		for(int i =0;i<s.length();i++)
		{
			if(s.charAt(i) != ' ')
			{
				si = i;
				break;
			}
		}
		for(int i =s.length()-1;i>=0;i--)
		{
			if(s.charAt(i) != ' ')
			{
				ei = i;
				break;
			}
		}
		String t = "";
		for(int i=si;i<=ei ;i++)
		{
			if((s.charAt(i)!=' ') ||  (s.charAt(i)==' ' && s.charAt(i+1)!=' '))
			{
				t = t+s.charAt(i);
			}
		}
		return t;
	}

	public static void main(String[] args) {
		
		/*
		 * Given a String s.write a program to remove all the extra spaces present in the string.
		 * 
		 * input = "      how    are    you   "
		 * output = "how are you"
		 */
		
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		String res = trim(s);
		System.out.println(res);

	}

}
