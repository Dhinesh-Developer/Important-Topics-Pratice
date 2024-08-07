import java.util.Scanner;

public class String_Check_palindrome {
	
	static String checkPalindrome(String s,String t)
	{
		for(int i=s.length()-1;i>=0;i--)
		{
			t = t+s.charAt(i);
			
		}
		if(s.equals(t))
		{
			return "Palindrome";
		}
		else {
			return "Not a palindrome";
		}
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = in.next();
	    String t = "";
;
		String res = checkPalindrome(s,t);
		System.out.println(res);
	}

}
