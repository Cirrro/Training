
public class MultidimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//multidimension array	
		
		//first bracket - x axis = row
		//second bracket - y axis = column
		// a[row][column]
		int a[][] = new int[2][3];
		
		a[0][0] = 2;     
		a[0][1] = 4;       
		a[0][2] = 5;
		a[1][0] = 3;
		a[1][1] = 4;        
		a[1][2] = 7;
		
		/*
		 2 4 5  what it looks like
		 3 4 7
		 */
		
		//System.out.println(a[1][0]);
		
		//straight forward multidimension array
		
		//int b[][] = {{2,4,5},{3,4,7},{5,2,1}};
		//System.out.println(b[2][1]);
		
		for(int i=0; i<2;i++) //row
		{
			
			for(int j=0;j<3;j++) //column
			{
				System.out.println(a[i][j]);
		
			}
		}	
			
		
		
	}

}
