package TestPackage;

public class TestClass {
	
	static int a=10;
	int b=20;

	public static void main(String[] args) 
	{
		TestClass t = new TestClass();
			int sum = a + t.b;
			System.out.println("Sum is "+sum);
	}
	
	public void nonstat()
	{
		int mul = a * b;
		System.out.println("Multiplication is = "+mul);
	}
}
