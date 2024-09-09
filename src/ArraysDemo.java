
public class ArraysDemo {
// Arrays - a container which store multiple values of same data type
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*int a;
		a = 4; */
		
		int a[] = new int[5]; //declares an array and allocates memory for the values
		
		a[0] = 2;
		a[1] = 6;
		a[2] = 1;
		a[3] = 9;
		a[4] = 12; //initialised values into that array
		
		int b[] = {1, 4, 3, 5, 7, 8}; //straight forward 
		
		for(int i=0; i<b.length ; i++)
		{
			System.out.println(b[i]);
			// retrieve values present in this array
		}
		
		
	}

}
