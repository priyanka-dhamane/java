package twodarray;

import java.util.Arrays;

public class sumofrow {
	
	
	public static void main(String[] args) {
		
		int sum=0;
		
		int[][] a = {{10,20,30},{40,50,60},{70,80,90}};
		
		System.out.println(Arrays.deepToString(a));
	
		// arrayName[rowIndex][columnindex]
		
		System.out.println(a[1][2]);
		
		
		for(int i=0;i<3;i++)
		{
			sum=0;// initilize sum variable to 0 for each row
			
			for(int j=0;j<3;j++)
			{
				sum = sum + a[i][j];
			}
			
			System.out.println("sum of " + " row " + i+1 + " is " + sum);
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
