import java.util.Scanner;

public class Count_Characters {
	
	
	static void countCharacters(String s)
	{
		int vc = 0 ,cc=0 ,nc = 0,spc = 0;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if((ch>='A' && ch<='Z' ) || (ch>='a' && ch<='z'))
			{
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' 
						|| ch=='A'||  ch=='E' || ch=='I'||  ch=='O'|| ch=='U')
				{
					vc++;
				}
				else 
				{
					cc++;
				}
				
			}
			else if(ch>='0' && ch<='9')
			{
				nc++;
			}
			else
			{
				spc++;
			}
			
		}
		System.out.println("vc = " +vc);
		System.out.println("cc = " +cc);
		System.out.println("nc = " +nc);
		System.out.println("spc = " +spc);
	}

	public static void main(String[] args) {
		
		//' given a String s. Write a program to count the numbers of vowels ,consonants,Numeric and 
		// Special characters in the string
		

		Scanner in = new Scanner(System.in); 
		String s= in.next();
		 countCharacters(s);
		


	}

}
