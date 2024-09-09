
public class childDemo extends parentDemo{
    //same variable parent / child
	String name = "QAClickAcademy";
	
	//same constructor parent / child
	public childDemo()
	{
		super(); //this should be always be at first line
		System.out.println("child class constructor");
	}
	
	public void getStringdata()
	{
		
		System.out.println(name);
		System.out.println(super.name);
		//super keyword will refers to the parent class variable
	}
	//same method parent / child
	public void getData()
	{
		super.getData(); //
		System.out.println("i am child class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		childDemo cd = new childDemo();
		cd.getStringdata();
		cd.getData();
		
	//without super keyword child will over right parent	
		
	
		
	}

}
