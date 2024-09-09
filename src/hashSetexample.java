import java.util.HashSet;
import java.util.Iterator;

public class hashSetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//HashSet treeset, LinkedHasset implements Set interfaces
	//set does not accept duplicate values
	// there is no guarantee elements stores in sequential order... random order probably
		
	HashSet<String> hs = new HashSet<String>();
	hs.add("USA");
	hs.add("UK");
	hs.add("INDIA");
	hs.add("INDIA"); // duplicate is not added when existed
	hs.add("he");
	hs.add("she");
	
	System.out.println(hs);
	//System.out.println(hs.remove("UK"));
	System.out.println(hs.isEmpty());
	System.out.println(hs.size());
		
	Iterator<String> i = hs.iterator();
	
	while(i.hasNext())
	{
		
	System.out.println(i.next());	

	
	}
	//Iterator
	
	
		
		
	}

}
