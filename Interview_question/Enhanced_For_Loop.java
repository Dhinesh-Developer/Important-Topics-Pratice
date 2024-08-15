package If_Else;

import java.util.Scanner;

public class Enhanced_For_Loop {

	public static void main(String[] args) {
		
		/*
		 * write a program to get the input from the user and display the data using array concept.usr foe_Each loop.
		 * input n = 5       1 2 3 4 5    output = 1 2 3 4 5 
		 */
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		
		//  For fetching the data or getting data from the user.
		for(int i =0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		
		// for display the data . Enhanced or Each For loop  . Enhanced for loop cannot use to get data .is used for display the data.
		// and only used for straight forward to display the data.
		
		for(int x: ar) {
			System.out.println(x);
		}
	} 

}
