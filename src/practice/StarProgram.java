package practice;

public class StarProgram {

	public static void main(String[] args) 
	{
		int i,j;
		for( i=0; i<=5; i++)
		{
			for(j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			
		System.out.println(" ");
		}
		
		System.out.println("==========================");
		
		int a,b,c;
		for(a=5; a>=1; a--)
		{
			for(b=1; b<=a; b++)
			{
				System.out.print(" ");
			}
			for(c=1; c<=5; c++)
			{
				System.out.println("*");
			}
			
			
			
		}

	}

}
