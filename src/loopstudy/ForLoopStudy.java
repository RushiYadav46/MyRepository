package loopstudy;

public class ForLoopStudy {
	
		
	public static void main(String[] args) 
	{
		System.out.println("Table of One ");	
		for (int a=1; a<11; a++)
		{
			System.out.println(a);
		}
		
		System.out.println("======================");
		
		System.out.println("Numbers in revers");
		for (int n=10; n>0; n--)
		{
			System.out.println(n);
		}
		
		System.out.println("======================");
		
	//Print Even numbers	
		System.out.println("Even values up to 10");
		for (int i=0; i<11; i=i+2)
		{
			System.out.println(i);
		}
		
		System.out.println("======================");
		
	//Print Odd numbers	
		System.out.println("Odd values up to 10");
		for(int i=1; i<11; i=i+2)
		{
			System.out.println(i);
		}
	}

}
