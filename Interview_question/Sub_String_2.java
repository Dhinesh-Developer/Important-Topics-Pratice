import java.util.Scanner;

public class Sub_String_2 {
	
	public static String PrintSubString(String s,int size)
    {
 	   for(int i=0;i<s.length()-size;i++)
 	   {
 		   String t = "";
 		   for(int j=i;j<size+i;j++)
 		   {
 			   t = t + s.charAt(j);
 		   }
 		 System.out.println(t);
 	   }
 	   return "No";
 	   
    }

	public static void main(String[] args) {
	
		/*
		 * Given a STring s`.write a program to print all the substrings of the length 4.
		 * input = mississippi  size =4  output = miss issi ssis siss issi ssip sipp ippi
		 */
       Scanner in = new Scanner(System.in);
       String s = in.next();
       int size = in.nextInt();
       PrintSubString(s,size);
		
       
       
	}

}
