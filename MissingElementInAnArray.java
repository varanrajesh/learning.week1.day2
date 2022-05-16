//$Id$
package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args)
	
	{
		int[] arr = {1,2,3,4,7,6,8};
		int length = arr.length;
	    Arrays.sort(arr);
	   // int j;
	  
			for(int i=0;i<length;i++)
			{
		
			if(arr[i] != (i+1) )
			{
				System.out.println("The Missing number in the given array is : "+(i+1));
				break;
			}
			
			
			
		}
			
	}

	}
	

