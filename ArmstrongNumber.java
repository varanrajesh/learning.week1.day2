//$Id$
package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) 
	
	{ 
		int n=153;
		int Orig=n;
		int sum=0;
		while(n>0)
		{
			int remainder=n%10;
			sum=sum+(remainder*remainder*remainder);
			n=n/10;
			
		}
		
		if(sum==Orig )
		{
			System.out.println("Given number "+sum +" is an Armstrong number");
		}
		else
		{
			System.out.println("Given number "+sum +" is not an Armstrong number");
		}
	
		

	}

}
