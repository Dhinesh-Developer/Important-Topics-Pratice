package If_Else;

import java.util.TreeSet;

public class SET_Tree_Set {

	public static void main(String[] args) {
		
		//   TREE SET display the output in sorted ascending  order. ANd duplicates are not allowed.
				
		//       TreeSet <Integer> set  = new TreeSet <Integer>();  // only allow to store integer value. [10, 23, 34, 45]
				TreeSet set = new TreeSet (); //  for storing all types of data. [30.0, null, "Dk", 10, 45.6, true]
				
				set.add(10);
				set.add(45);
				set.add(23);
				set.add(34);
				set.add(10);  // duplicates not allowed in set.
				
			
				System.out.println(set);
				

	}

}
