import java.util.Scanner;

public class Sub_String_1 {
	
	static String checkSubStringFound(String s1,String s2)
	{
		int i=0,j=0;
		while(i<s1.length() && j<s2.length())
		{
			if(s1.charAt(i) == s2.charAt(j))
			{
				i++;
				j++;
			}
			else
			{
				i++;
			}
		}
		return j==s2.length()?"Yes" : "No";
	}

	public static void main(String[] args) {

/*
 * Given a Two Strings s1 and s2. check Whether string s2 can be found as as subsequences in the string s1.
 * 
 * input  s1= hereiamstackerrank  s2 = hackerrank  output = yes
 */
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		String res = checkSubStringFound(s1,s2);
		System.out.println(res);
		
	}

}
