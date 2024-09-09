
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 // to run object inside the main from outside, create the class name as new object
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		
	//from other Class	
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();
		
	//from static getdata2	
		getData2(); //can call object with just method name
		
		
	}

	// create any method in class outside the main
	public String getData() 
	{
		System.out.println("Hello World!");
		return "rahul shetty";
	}
	
	public static String getData2() // adding static keyword will move the object to class level and add to the main
	{
		System.out.println("Hello World!");
		return "rahul shetty";
	}
	
	
	
}
