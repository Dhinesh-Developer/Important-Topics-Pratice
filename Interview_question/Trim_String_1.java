import java.util.Scanner;

public class Trim_String_1 {
	
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
			t = t+s.charAt(i);
		}
		return t;
	}

	public static void main(String[] args) {

   /*
    * Given a String s.write a program to trim all the spaces from the starting and ending of the string
    * input = "  how  are  you      " output = "how  are  you" empty spaces are character remove that spaces.
    * 
    */
		Scanner in = new Scanner(System.in);
	
		String s = in.nextLine();
		String res = trim(s);
		System.out.println(res);

	}

}
