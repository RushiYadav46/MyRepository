package polymorphism;

public class A {

	public static void main(String[] args) 
	{
		main();
		main(10);
		A a =new A();
		a.method_1();
		a.method_1(null);

	}
	
	//overloading of main method
	
	public static void main()
	{
		System.out.println("Main method overloading-1");
	}
	
	public static void main(int a)
	{
		System.out.println("Main method overloading-2");
	}
	
	// overloading other methods
	
	void method_1()
	{
		System.out.println("method-1 from class A");
	}
	
	void method_1(String a)
	{
		System.out.println("Overloading other method-2");
	}

}
