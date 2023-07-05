package polymorphism;

public class B extends A{

	public static void main(String[] args) 
	{
		A a = new A();
		B b = new B();
		a.method_1();
		b.method_1();
		

	}
	public static void sample() {
		main();
	}
	void method_1()
	{
		System.out.println("Overriding method_1 method from class A");
	}
	

}
