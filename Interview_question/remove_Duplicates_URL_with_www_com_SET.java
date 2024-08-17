import java.util.Scanner;
import java.util.TreeSet;

public class remove_Duplicates_URL_with_www_com_SET {
	
	public static void removeDuplicatesUrl(String s)
	{
		String[] ar = s.split(",");
		
		TreeSet <String> set = new TreeSet<String>();
		for(int i=0;i<ar.length;i++)
		{
			String [] x = s.split("\.");  //error
			set.add(x[1]);
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
		 * output =  fb
                     fb
                     google
                     tap
		 */
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		removeDuplicatesUrl(s);

	}

}
