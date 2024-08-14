import java.util.Scanner;

public class String_To_Array {
	
	public static int countWords(String s)
	{
		int count =0;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i) ==' ' && s.charAt(i+1) != ' ')
			{
				count++;
			}
		}
		return s.charAt(0) ==' ' ? count : count+1 ;
	}
	
	public static String[] split(String s)
	{
		int j =0;
		String t = "";
		int count = countWords(s); // calling countWords function to get the count of array size.
		String[] ar = new String[count];
		for(int i =0;i<s.length();i++)
		{
			if(s.charAt(i) != ' ')
			{
				t = t+s.charAt(i);
			}
			else if(t.length() >0 )
			{
				ar[j] = t;
				j++;
				t = "";
			}
			ar[j] = t;
		}
		
		return ar;
	}

	public static void main(String[] args) {
	
		/*
		 * Given a String s.write a program that print each word in the striing on a new line . use array to print all the string.
		 * input  = how are you.  output = how   new line   are   new line    you
		 *                                
		 */
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String[] res = split(s);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}

	}

}
