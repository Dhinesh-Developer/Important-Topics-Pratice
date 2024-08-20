package Arrays_Pratice;

import java.util.Scanner;

public class Print_Array {
	
	public static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		
	/*
	 * write a program to print the array values whatever we get from user.
	 * input = size =5    1 2 3 4 5 6 7 8 9 0     output = 1 2 3 4 5 6 7 8 9 0 
1 2 3 4 5 6 7 8 9 0 
	 */
	
	Scanner scan = new Scanner(System.in);
	int size = scan.nextInt();
	int[] arr = new int[size];
	
	for(int i=0;i<arr.length;i++)
	{
		arr[i] = scan.nextInt();
	}
	printArray(arr);
	}

}
