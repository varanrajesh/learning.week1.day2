//$Id$
package week1.day2;

public class Calculator 

{
	
	public void add(int a, int b)
	
	{
		int c=a+b;
		System.out.println("Addition value is :"+c);
	}
	
	public void sub(int a, int b)
	
	{
		int c=a-b;
		System.out.println("Sub Value is"+c);
	}
	
	public void multiply(int a, int b)
	
	{
		int c=a*b;
		System.out.println("Multiply value is"+c);
	}
	
	public void divide(int a, int b)
	
	{
		int c=a/b;
		System.out.println("Division Value is "+c);
	}
	
	public static void main(String[] args)
	
	
	{
		
		Calculator calc = new Calculator();
		calc.add(10, 5);
		calc.sub(20,10);
		calc.multiply(16, 20);
		calc.divide(25, 5);
		
	}

}
