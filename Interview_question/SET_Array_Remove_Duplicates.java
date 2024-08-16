package If_Else;

import java.util.Scanner;
import java.util.TreeSet;

public class SET_Array_Remove_Duplicates {
	static void removeDuplicates(int [] ar)
	{
		TreeSet <Integer> set = new TreeSet <Integer>();
		for(int i=0;i<ar.length;i++)
		{
			set.add(ar[i]);
		}
		for(int x : set)
		{
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		/*
		 * Given a array ar.write a program to remove duplicate characters from the array and print them in increasing order.
		 * input = 5 7 3 2 5 7 3 1 4 2   n = 10     output = 1 2 3 4 5 7

		 */
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int []ar = new int[n];
		for(int i =0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		removeDuplicates(ar);
	}

}
