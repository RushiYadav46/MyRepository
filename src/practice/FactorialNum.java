package practice;

public class FactorialNum {

	public static void main(String[] args)
	{
		int temp=1;
		int fact=7;
		
		for(int i=1; i<=fact;i++)
		{
			temp = temp*i;			
		}
		System.out.println("Factorial of "+fact+" is = "+temp);
	}

}
