package thisAndSuper;

public class Test_2 extends Test_1 {
	int add;
	int x=10;

	public static void main(String[] args) 
	{
			

	}
	public void sample_3()
	{
		add=x+super.b+super.a;
		System.out.println(add);
	}
	
	public static void sample_4()
	{
		/*add = x + super.b; --> this line will throw error cause we can't use super keyword in static method even though 
								the variable is static global variable */
	}

}
