
public class ChildEmirates extends ParentAirCraft{
// extend use for inheritance / abstract
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildEmirates c = new ChildEmirates();
		c.engine();
		c.safetyGuidelines();
		c.bodycolor();
		
		
		// ParentAirCraft p = new ParentAirCraft();
		// cannot create an object of class if the class is treated as an abstract
	}

	@Override
	public void bodycolor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
	}

}
