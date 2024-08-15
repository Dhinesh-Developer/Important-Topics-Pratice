package If_Else;


import java.util.LinkedHashSet;

public class SET_Linked_Hssh_set {

	public static void main(String[] args) {
		
		         //  LINKED HASH SET display the output in insertion order. ANd duplicates are not allowed
		
	   			// LinkedHashSet <Integer> set  = new LinkedHashSet <Integer>();  // only allow to store integer value.[10, 45, 23, 34]
				//
		
		    LinkedHashSet set = new LinkedHashSet (); //  for storing all types of data. [10, 45.4, 23.0, null, dk, true]
		/*		
		        set.add(10);
				set.add(45);
				set.add(23);
				set.add(34);
				set.add(10);  // duplicates not allowed in set.
				*/
				
				
				set.add(10);
				set.add(45.40f);
				set.add(23.00);
				set.add(null);
				set.add("dk");
				set.add(true);
				
				System.out.println(set);
				
				

	}

}
