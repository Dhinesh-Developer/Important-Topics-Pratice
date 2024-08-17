import java.util.Scanner;
import java.util.LinkedHashSet;

public class Remove_Duplicates_In_Paragraph_SET {
	
	public static void removeDuplicatesWords(String s)
	{
		String []ar = s.split(" ");
		LinkedHashSet <String> set = new LinkedHashSet <String>();
		for(int i=0;i<ar.length;i++)
		{
			set.add(ar[i]);
		}
		for(String x : set)
		{
			System.out.print(x +" ");
		}
		
	}

	public static void main(String[] args) {
		
		/*
		 * Given a string s. write a program to remove duplicates words from the string and
		 *  print them in the order of their first occurrence.
		 *  input= fear leads to anger anger leads to hatred hatred leads to conflict conflicts leads to suffering.
		 *  output = fear leads to anger hatred conflict conflicts suffering 
		 * 
		 */
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		removeDuplicatesWords(s);
		in.close();

	}

}
