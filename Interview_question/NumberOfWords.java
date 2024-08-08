import java.util.Scanner;

public class NumberOfWords {
	// given a string s. write a program to print the  number of words in the string.
	// input= how are you   output = 3
	static void CountWords(String s)
	{
		int count = 1;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		System.out.println(s.charAt(0)==' '?count-1 :count);
		
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String s= in.nextLine();
		CountWords(s);


	}

}
