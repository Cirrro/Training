
public class ChildLevel extends ChildClassDemo {
	//Function overloading
	// either argument count should be different or
	// argument data should be different
	public void getData(int a)
	{
		System.out.println(a);
		
	}
	
	public void getData(String a)
	{
		
		System.out.println(a);
	}
	public void getData(int a, int b)
	{
		
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ChildLevel cl = new ChildLevel ();
		
		cl.audiosystem();
		cl.getData(2);
		cl.getData("hello");
		cl.getData(1, 3);
	}

}
