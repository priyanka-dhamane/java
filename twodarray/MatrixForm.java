package twodarray;

import java.util.Arrays;

public class MatrixForm {
	
	
	public static void main(String[] args) {
		
		int[][] a = {{10,20,30},{40,50,60},{70,80,90}};
		
		System.out.println(Arrays.deepToString(a));
	
		// arrayName[rowIndex][columnindex]
		
		System.out.println(a[1][2]);
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			
			System.out.println();
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
