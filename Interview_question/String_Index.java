import java.util.Scanner;

public class String_Index {
	
	static int indexOfCharacter(String s,char k)
	{
		for(int i =0;i<s.length();i++)
		{
			if(s.charAt(i) == k)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

     /*
      * Given a String s and character k. write a program to find the index of k in s.
      * input = matrix  k = r   output = 3.
      * 
      */
		
		
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char k = in.next().charAt(0);
		int res = indexOfCharacter(s,k);
		System.out.println(res);
	}

}
