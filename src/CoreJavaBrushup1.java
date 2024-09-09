
public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int myNum = 5;
		String website = "Rahul Shetty Academy";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
		
		System.out.println(myNum+" "+"is the value stored in the myNum variable");
		System.out.println(website);
		
		//Arrays - store multiple value in 1 variable
		
		int[] arr = new int[5]; //store limit assign //static
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10}; // shortcut of assigning values in array
		
		System.out.println(arr2[2]);

		//For loop arr.length = 5
		
		//for(int i = 0; i < arr.length; i++)
	//	{
	//		System.out.println(arr[i]);
			
	//	}
		
		//int for loop
		for (int i=0; i<arr2.length; i++)
		{
			
			System.out.println(arr2[i]);
		}
		
		
		//String for loop
		String[] name = {"rahul", "shetty", "selenium"};
		
		for(int i =0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		//Enhance for loop - simpler
		for( String s: name)
		{
			System.out.println(s);
		}
		
	}

}
