import java.util.Scanner;

public class Sub_String_3 {
	
	public static String findSubString(String s1,String s2)
	{
		int size  =s2.length();
		for(int i=0;i<=s1.length()-size;i++)
		{
			String t = "";
			for(int j=i;j<size+i;j++)
			{
				t = t+s1.charAt(j);
			}
			if(t.equals(s2))
			{
				return "Yes";
			}
		}
		return "No";
	}

	public static void main(String[] args) {


		/*
		 * Given a two string s1,s2 .write a program to check whether string s2 is present in the string s1.
		 * input s1 = mississippi s2 = issi   output yes
		 */
		Scanner in =new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		String res = findSubString(s1,s2);
		System.out.println(res);

	}

}
