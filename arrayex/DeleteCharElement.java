package arrayex;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteCharElement {

	
	public static void main(String[] args) {
		
		char[] a= {'j','a','v','a'};
		
		
		System.out.println("Enter character to delete :- ");
		char ch=new Scanner(System.in).next().charAt(0);
		int index=0;
		
		while(true)
		{
			if(a[index]==ch)
			{
				break;
			}
			
			index++;
		}
		
		for(int i=index;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
			
		//System.out.println(Arrays.toString(a));
	
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}
}
