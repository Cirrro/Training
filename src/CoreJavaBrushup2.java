import java.util.ArrayList;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		
		//for loop multiple by 2
		
		for(int i=0; i<arr2.length; i++)
		{
			if (arr2[i] % 2 == 0) //== to compare
			{	
			System.out.println(arr2[i]);
			break; //exit the loop if condition met already
			}
			else
			{
			System.out.println(arr2[i] + " "+"is not multiple of 2");
			}
			
		}
		
		//dynamic increase array size, no fix size
		
		ArrayList<String> a = new ArrayList<String>(); //create object of the class - object.method
		a.add("rahul");
		a.add("shetty");
		a.add("academy");
		a.add("selenium");
		System.out.println(a.get(3));
		
		
		
		
		
		
		
	}

}
