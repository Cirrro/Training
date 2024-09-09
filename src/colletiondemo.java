import java.util.ArrayList;

import org.apache.commons.exec.launcher.Java13CommandLauncher;

public class colletiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {4, 5, 5, 5, 4, 6, 6, 9, 4};
		//Print unique number from the list
		//Empty arraylist 
		// 4 = 3, 5 = 3, 6 = 2, 9 = 1 - output repeated
		
		ArrayList<Integer> ab = new ArrayList<Integer>();
		// arraylist for collecting the output
		
		for(int i=0; i<a.length; i++)
			
		{
			int k = 0;
			if(!ab.contains(a[i])) //check if arraylist contains the value
			{
				
				ab.add(a[i]);
				k++;
				
				for(int j=i+1; j<a.length; j++)
					
				{
					
					if(a[i]==a[j]) // compare the value
					{
						
						k++;
						
						
					}
					
				}
				//System.out.println(a[i]);
				//System.out.println(k); //repeated
				
				if (k==1)
					System.out.println(a[i] + "is unique number");
				//printing not repeated number = unique
			}
			
		}
		
	}

}
