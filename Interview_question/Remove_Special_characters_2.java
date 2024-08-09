import java.util.Scanner;

public class Remove_Special_characters_2 {
	
	
	static void RemoveSpecialCharacters(String s)
	{
		String t1="";
		String t2="";
		for(int i =0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
			{
				t1=t1+ch;
			}
			else if(ch>='0' && ch<='9')
			{
				t2=t2+ch;
			}
		}
		System.out.println(t1+t2);
	}


	public static void main(String[] args) {

		/*
		  Given a String s.Write a program to remove all special characters
		  from the string ,alphabets should come first them number should last without 
		  changing the order. cannot add special characters
		  
		  input = H1e5ll7$2o    output = Hello1572
		 */
		
		Scanner in = new Scanner(System.in);
		String s = in.next();
		RemoveSpecialCharacters(s);
	}

}
