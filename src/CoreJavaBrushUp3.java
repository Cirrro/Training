
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//string is an object represent sequence of character
		// String literal
		String s = "Rahul Shetty Academy";
		String s1 = "Rahul Shetty Academy";
		String s5 = "Hello";
		                                        // difference is the new memory will create new object in the memory space
		//New Memory allocate operator
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String[] splittedString = s.split("Shetty"); //split the string base upon white spaces
		                                             // if declare in the parenthesis the string will be ignored
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim()); // trim the left and right white spaces in the string
		
		for(int i= s.length()-1; i >= 0; i--) // reverse
		{
			
			System.out.println(s.charAt(i)); //can print character by character
		}
		
		
	}

}
