
public class ChildClassDemo extends ParentClassDemo {
      // java cannot extends multiple inheritances, but allowed in interfaces

	 public void audiosystem()
	{
		System.out.println("new audio child");
	} 
	
	public void engine()
	{
		System.out.println("new engine");
	}
	public void colour()
	{
		System.out.println(colour);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChildClassDemo cd = new ChildClassDemo();
		cd.colour();
		cd.breaks();
		cd.audiosystem(); // function overriding - both have method same name, same signature, same parameters
						  // but will override the parent method with the child method
		
	}

}
