
public class AustrialianTraffic implements CentralTraffic, continentTraffic { //implement the interface in class
																				//can add multiple interface by writing comma only
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//code
		
	//all interface must be added to have no error	
		//create an object in this class to implement the methods present in interface in this class
		CentralTraffic a = new AustrialianTraffic();
		a.redStop();
		a.flashyellow();
		a.greenGo();
	
		
		
		AustrialianTraffic at = new AustrialianTraffic();
		at.walkonsymble();
		
		continentTraffic ct = new AustrialianTraffic();
		ct.Trainsymble();
	}



@Override
public void redStop() {
	// TODO Auto-generated method stub
	System.out.println("redstop implementation");
	
}
public void walkonsymble()
{
	System.out.println("walking");
}
@Override
public void flashyellow() {
	// TODO Auto-generated method stub
	System.out.println("flashyellow implementation");
	
}

@Override
public void greenGo() {
	// TODO Auto-generated method stub
	System.out.println("greenGo implementation");
	
}



@Override
public void Trainsymble() {
	// TODO Auto-generated method stub
	System.out.println("Trainsymble implementation");
}

}
