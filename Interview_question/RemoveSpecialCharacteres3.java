import java.util.Scanner;

public class RemoveSpecialCharacteres3 {
	

	static void RemoveSpecialCharacters(String s)
	{
		String t1="";
		int sum = 0;
		for(int i =0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
			{
				t1=t1+ch;
			}
			else if(ch>='0' && ch<='9')
			{
				sum = sum + (ch-48); 
			}
		}
		System.out.println(t1+sum);
	}


	public static void main(String[] args) {
		
		/*
		  Given a String s.Write a program to remove all special characters
		  from the string ,alphabets should come first them { add number } should last without 
		  changing the order. cannot add special characters
		  
		  input = H1e5ll7$2o    output = Hello15  output is Hello + 15 because 1+5+7+2 = 15
		 */
		
		Scanner in = new Scanner(System.in);
		String s = in.next();
		RemoveSpecialCharacters(s);

	}

}
