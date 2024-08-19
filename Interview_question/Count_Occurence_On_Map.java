import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Count_Occurence_On_Map {
	
	public static void countOccurence(String s)
	{
		LinkedHashMap <Character,Integer> map = new LinkedHashMap <Character,Integer> ();
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(map.containsKey(ch))  // for checking the if the character is already present
			{
				int c = map.get(ch);
				map.put(ch, c+1);
			}
			else {  // if the character is present in one time only.
				map.put(ch, 1);
			}
		}
		String t = "";
		Set<Entry<Character,Integer>> entries = map.entrySet();
		for(Entry<Character,Integer> e : entries )
		{
			t = t + e.getKey() + e.getValue();
		}
		System.out.println(t);
		
	}
   
	public static void main(String[] args) {
		
		/*
		 * Givena String s. write a program to count the number of occurences of each character and concatenate the count to the 
		 * corresponding characters,maintaining the order of their first appearence in the string.
		 * input = mississppi  output = m1i4s4p2 
		 */
	
		Scanner in = new Scanner(System.in);
		String s = in.next();
		countOccurence(s);
		

	}

}
