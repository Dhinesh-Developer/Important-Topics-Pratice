import java.util.Scanner;

public class Count_Consonants {
	
	static int countConsonants(String s)
	{
		int vc = 0 ,cc=0;
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
				else {
					cc++;
				}
			}
			
		}
		return cc;
	}
	

	public static void main(String[] args) {
		
		
		// given a String s.Write a program to count the  numbers of constants in the string.
		
		Scanner in = new Scanner(System.in); 
		String s= in.next();
		int res = countConsonants(s);
		System.out.println(res);

	}

}
