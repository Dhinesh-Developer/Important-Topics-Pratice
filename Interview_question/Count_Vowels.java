import java.util.Scanner;

public class Count_Vowels {

	static int countVowels(String s)
	{
		int count  = 0;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' 
					|| ch=='A'||  ch=='E' || ch=='I'||  ch=='O'|| ch=='U')
			{
				count++;
			}
			
		}
		return count;
	}
	
	  
	public static void main(String[] args) {
		
		// Given a string s. write a program to count the numbers of vowels in the string
		// input = hello    output = 2
		 
		Scanner in = new Scanner(System.in); 
		String s= in.next();
		int res = countVowels(s);
		System.out.println(res);
	}

}
