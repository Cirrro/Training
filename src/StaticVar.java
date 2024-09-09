
public class StaticVar {
  // declare in class belongs to instance called instance variable
	String name;
	String address;
	static String city = "Bangalore"; 	// static variable copy is share by all the objects
									  	// saves memory
										// class variables - belongs to class
	static int i = 0;
	static int j;
	static String street;
	static //static blocks - can initialised all static variables
	{
		j = 0;
		street = "1st street";
	}
	
	StaticVar(String name, String address)
	{
		// variables under constructor are Local variable
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}
	
	public void getAddress()
	{
		System.out.println(address+" "+city);
	}
	
	public static void getCity() //Static method only accepts static variable
	{
		
		System.out.println(city);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVar obj = new StaticVar("Bob","Marthalli");
		StaticVar obj1 = new StaticVar("Ram","Jayangaer");
		obj.getAddress();
		obj1.getAddress();   
		StaticVar.getCity(); //how to called static method
		
	}

}
