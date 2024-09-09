import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//all class which implement array interface can accept duplicate values
		//ArrayList, LinkedList, vector Implementing List Interfaces
		
		// array have fix size
		// array list can grow dynamically
		// you can access and insert any value in any index
		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("java");
		a.add("java"); //duplicate is acceptable
		System.out.println(a); 
		a.add(0, "student"); //add with index number
		System.out.println(a); 
		//a.remove(1);
		//a.remove("java");  // remove
		//System.out.println(a); 
		System.out.println(a.get(2)); //getting particular index in array list
	
		System.out.println(a.contains("java")); //contains - boolean true/false
		
		System.out.println(a.indexOf("rahul")); //check what index
		
		System.out.println(a.isEmpty()); // check if array is empty - true/false
		
		System.out.println(a.size()); //check the length of array
		
		
		
	}

}
