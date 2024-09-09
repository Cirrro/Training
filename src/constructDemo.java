
public class constructDemo {
	//constructor will not return values
    //name of constructor should be the class name
	
	//default constructor
	public constructDemo()
	{
		System.out.println("I am in the constructor");		
		System.out.println("I am in the constructor lecture 1");		
	}
	
	
	//parameterized constructor
	public constructDemo(int a, int b)
	{
		System.out.println("I am in the parameterized constructor");
		int c = a+b;
		System.out.println(c);
	}
	
	public constructDemo(String str)
	{
		System.out.println(str);
		
	}
	
	public void getData()
	{
		System.out.println("I am the method");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Constructor executes block of code when ever an object is created
			
	//when ever you create an object constructor is called	
	// compiler will call implicit constructor if you have not define any constructor block
		constructDemo cd = new constructDemo();
		constructDemo c = new constructDemo(4, 5);
		constructDemo sd = new constructDemo("hello");
		
			
	}

}
