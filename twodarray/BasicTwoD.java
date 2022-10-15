package twodarray;

import java.util.Arrays;

/* Arrays.toString() gives content of 1d array
 * Arrays.deepToString() gives content of 2d array
 *  */
public class BasicTwoD {
	
	public static void main(String[] args) {
		
		int[] b = {10,20};
		System.out.println(Arrays.toString(b));
		
		int[][] a = new int[2][2];
		
		System.out.println(Arrays.deepToString(a));
		
		a[0][1]=30;
		
		System.out.println(Arrays.deepToString(a));
	}

}
