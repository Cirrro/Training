
public class exceptionDemo {

	int a=4;
	//3 lines of code
	//try catch mechanism
	
	
	
	
	//try - catch mechanism
	// used by programmer to check if the code might throw error
	//try catch never fail
	
	// one try can be followed by multiple catch blocks
	//catch should be an immediate block after try
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b=7;
		int c=0;
		
		try
		{
		int k=b/c;
		int arr[] = new int[5];	
			
		{
		System.out.println(k);	
		System.out.println(arr[7]);	
		}
		
		
		}
		catch(ArithmeticException et) //specifically catch only arithmetic exception
		{
			System.out.println("I catched the arithmethic/exception");
		}
		catch(IndexOutOfBoundsException ets)// specifically catch only out of bounds exception
		{
			System.out.println("I catched the IndexOutofBounds/exception");
		}
		
		catch(Exception e) // general exception, accept all kinds of exception
		{
			//retry again
			System.out.println("I catched the error/exception");
		}
		
		
		finally
		{
			//this block is executed irrespective of exception thrown or not
			//even the code got failed in the middle
			//execute present in finally block
			// use only when there is try-catch
			
			System.out.println("delete cookies");
		}
		
		
	}

}
