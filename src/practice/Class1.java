package practice;

public class Class1 {

	public static void main(String[] args) 
	{
	//Calling the functions of same class
		
		SM1();
		Class1 s = new Class1();
		s.NSM1();
		
		System.out.println("================================================");
	
	//Calling the function of Another class
		
		Class2.SM2();
		Class2 S2 = new Class2();
		S2.NSM2();

	}
	
	public static void SM1()
	{
		System.out.println("This is static method of same class ");
	}
	
	public void NSM1()
	{
		 System.out.println("This is Non-static method of same class ");
	}

}
