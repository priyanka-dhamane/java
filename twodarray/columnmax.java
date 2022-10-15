package twodarray;

import java.util.Arrays;

public class columnmax {
	
	
	public static void main(String[] args) {
		
		int max;
		
		int[][] a = {{10,20,30},{40,50,60},{70,80,90}};
		
		System.out.println(Arrays.deepToString(a));
	
		// arrayName[rowIndex][columnindex]
		
		System.out.println(a[1][2]);
		
		// i value is used for column 
		for(int i=0;i<3;i++)
		{
			max=a[0][i];// Initialize max variable with first element of each column
			
			// j value is used for row
			
			for(int j=0;j<3;j++)
			{
				if(a[j][i] > max)
					max=a[j][i];
			}
			
			System.out.println("Max of " + " column " + (i+1) + " is " + max);
		}
	
	}
	
	
	/*     
	  			0  1  2===column index
	  		
	  		0	10 20 30
	  		1	40 50 60
	  		2	70 80 90
	  		
	  		row index
	  		
	 */

}
