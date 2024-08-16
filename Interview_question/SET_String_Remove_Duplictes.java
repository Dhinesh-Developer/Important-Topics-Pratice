package If_Else;

import java.util.Scanner;
import java.util.TreeSet;

public class SET_String_Remove_Duplictes {
	
	public static String removeDuplicates(String s)
	{
		TreeSet <Character> set = new TreeSet <Character> ();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		String t = "";
		for(char ch : set)
		{
			t = t+ch;
		}
		return t;
	}

	public static void main(String[] args) {
	
		/*
		 * given a string s .Write a program to remove duplicate characters from the String and print them in the insertion order.
		 * input = mississippi   output = imps
		 */
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String res = removeDuplicates(s);
		System.out.println(res);
	}

}
