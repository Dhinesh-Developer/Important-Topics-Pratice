import java.util.Scanner;

public class numberOfSpaces {

	// given a string s. write a program to print the  number of spaces in the string. spaces between the words.
	// input = hopw are you   outpt= 2
	
	static void CountSpaces(String s)
	{
		int count = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		
		
		// Given a String s. Write a Program to print the  number of spaces in the STring.
		//input how are you output 2
		
		Scanner in = new Scanner(System.in);
		
		String s= in.nextLine();
		CountSpaces(s);

	}

}
