import java.util.Scanner;
import java.util.LinkedHashSet;

public class Remove_Duplicates_URL_SET {
	
	public static void removeDuplicatesUrl(String s)
	{
		String[] ar = s.split(",");
		
		LinkedHashSet <String> set = new LinkedHashSet<String>();  // insertion order to display
		for(int i=0;i<ar.length;i++)
		{
			set.add(ar[i]);
		}
		for(String x: set)
		{
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
	
		/*
		 * Given a String s. containing multiple URL"s separated by comma, write a program to remove all duplicates URL's
		 * and print the unique url's in the lexicographical orders ( alphabet order )
		 * 
		 * input = www.fb.com,www.google.com,www.fb.com,www.google.com,www.tap.com,www.insta.com
		 * output =  www.fb.com
                     www.google.com
                     www.tap.com
                     www.insta.com
		 */
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		removeDuplicatesUrl(s);

	}

}
