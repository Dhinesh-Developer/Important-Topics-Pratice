package Arrays_Pratice;
import java.util.Scanner;

public class print_Odd_Number_Element {
	
	public static void oddNumberElement(int[] ar)
	{
		for(int i=1;i<ar.length;i+=2)
		{
			System.out.println(ar[i]);
		}
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		oddNumberElement(ar);
	}

}
