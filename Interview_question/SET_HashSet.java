package If_Else;

import java.util.HashSet;

public class SET_HashSet {

	public static void main(String[] args) {
		
		
		// HASH SET display the output in random order. ANd duplicates are not allowed.
		HashSet <Integer> set  = new HashSet <Integer>();  // only allow to store integer value. [34, 23, 10, 45]
		//HashSet set = new HashSet (); //  for storing all types of data. [30.0, null, "Dk", 10, 45.6, true]
		set.add(10);
		set.add(45);
		set.add(23);
		set.add(34);
		set.add(10);  // duplicates not allowed in set.
		
		/*
		set.add(10);
		set.add(45.40f);
		set.add(23.00);
		set.add(null);
		set.add("dk");
		sest.add(true);
		*/
		System.out.println(set);
		
		
	}

}
