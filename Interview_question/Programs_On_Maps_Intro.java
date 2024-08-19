package If_Else;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Set;

public class Programs_On_Maps_Intro {

	public static void main(String[] args) {

		HashMap <String,Integer> map= new HashMap <String,Integer>();
		map.put("India", 1000);
		map.put("China", 10000);
		map.put("Japan", 100);
		map.put("usa", 900);
		map.put("uae", 300);
		map.put("italy", 100);
		map.put("indonesia", 600);
		System.out.println(map);
		//ouput = {usa=900, China=10000, Japan=100, uae=300, indonesia =600, italy=100, India=1000}
		
		
		
		// traversing an map
		/*Set<String> keys = map.keySet();
		for(String key : keys) // in the order of singular and plural
		{
			System.out.println(key);    usa China Japan uae indonesia italy India 
		}
		*/
		
		// Another way to traversing an map.
		
		
		Set<String> keys = map.keySet();    // usa China Japan uae indonesia italy India 


		for (String key : keys)
		{
			System.out.print(key+" ");
		}
		

	}

}
