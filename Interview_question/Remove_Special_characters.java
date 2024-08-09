import java.util.Scanner;

public class Remove_Special_characters {
	
	static void RemoveSpecialCharacters(String s)
	{
		String t ="";
		for(int i =0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
			{
				t=t+ch;
			}
		}
		System.out.println(t);
	}

	public static void main(String[] args) {
		
		/*
		 Given a  string s.write a program to remove a all the special characters in the string.
		 input = Hel#$o& output= Helo
		 */
		
		Scanner in = new Scanner(System.in);
		String s = in.next();
		RemoveSpecialCharacters(s);
	}

}
