import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(0, "Hello");
		hm.put(1, "Goodbye");
		hm.put(2, "Morning");
		hm.put(3, "Evening");
		System.out.println(hm.get(2));
		hm.remove(2);
		System.out.println(hm.get(2)); //no key 2 = null
		Set sn = hm.entrySet(); // converting hashmap to a set object
		Iterator it = sn.iterator();
		
		while(it.hasNext())
			{      //Map.Entry separates key and value for extracting
			Map.Entry mp = (Map.Entry)it.next(); //print out what next in hash map
			System.out.println(mp.getKey()); //0 will be printed
			System.out.println(mp.getValue()); // Hello will be printed
			
			}
		
		
		
	}

}
