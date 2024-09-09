
public class thisDemo {

	int a = 2; //global variable
	
	public void getData()
	{
		int a = 3; //local variable
		int b = a+this.a; //sum of global variable and local variable
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
		// this keyword refers to current object - object scope lies in class level
	
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		thisDemo td = new thisDemo();
		td.getData();
		
	}

}
