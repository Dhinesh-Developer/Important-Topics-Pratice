import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		
		
		// print String. input hello output hello
		
		/*
		Scanner in = new Scanner(System.in);
		String s= in.next();
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		*/
		
		
		// Print The String in Reverse order. input java output avaj
		// because  String are immutable in java ,
		//that why create a new  string and add a character by character
		Scanner in = new Scanner(System.in);
		String s= in.next();
		String t = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			t=t+s.charAt(i);
		}
		System.out.println(t);

	}

}
