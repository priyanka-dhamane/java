package twodarray;

import java.util.Arrays;

public class maxofeachrow {
	
	
	public static void main(String[] args) {
		
		int max;
		
		int[][] a = {{10,20,30},{40,50,60},{70,80,90}};
		
		System.out.println(Arrays.deepToString(a));
	
		// arrayName[rowIndex][columnindex]
		
		System.out.println(a[1][2]);
		
		
		for(int i=0;i<3;i++)
		{
			max=a[i][0];// Initialize max variable with first element of each row 
			
			for(int j=0;j<3;j++)
			{
				if(a[i][j] > max)
					max=a[i][j];
			}
			
			System.out.println("Max of " + " row " + (i+1) + " is " + max);
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
