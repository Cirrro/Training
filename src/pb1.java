
public class pb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//nested loop works
		//Outer for loop
		
		int k=1;
		for(int i=0; i<4;i++) // this block will loop for 4 times
		{
		//	System.out.println("Outer loop starter");
			
			//inner for loop
			for(int j=1; j<=4-i;j++)
				
			{
				
				System.out.print(k); //ln means printing is separate lines
				System.out.print("\t"); // putting space
				k++;
			
				
			}
		}
		
		
		
		
	}

}
