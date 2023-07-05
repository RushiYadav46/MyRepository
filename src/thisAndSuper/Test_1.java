package thisAndSuper;

public class Test_1 {
	
	int a=10;
	int b=90;

	public static void main(String[] args) 
	{
		Test_1 t1 = new Test_1();
		t1.sample_1();

	}
	
	public void sample_1()
	{
		int sum_1;
		int a=40;
		int b= 30;
		System.out.println("using local variables");
		sum_1 = b+a;
		System.out.println(sum_1);
		System.out.println("Calling global variables by using 'this' keyword");
		int sum_2;
		sum_2 =this.a +this.b; //using "this" for calling global variables
		System.out.println(sum_2);
	}
	
	public static void smaple_2()
	{
		int a=11;
		int b=12;
		int add;
		//add = this.a + this.b;   //this line throws error cause we can't use 'this' in static method
		add= a+b;
		System.out.println(add);
	}

}
