package loopstudy;

public class FibonacciPract {

	public static void main(String[] args) 
	{
		//Program for Fibonacci Number
		int a=0;
		int b=1;
		int c;
		
		for (int i=0; i<11; i++)
		{
			System.out.print(a+" , ");
			c=a+b;
			a=b;
			b=c;
		}
		
		System.out.println(" ");
		System.out.println("======================");
		
		//Program to check Odd or Even numbers
		int x=4;
		int rem;
		rem = x%2;
		if (rem==1)
		{
			System.out.println("It is a ODD number! ");
		}
		else
		{
			System.out.println("It is a EVEN number! ");
		}

	}

}
