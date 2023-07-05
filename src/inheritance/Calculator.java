package inheritance;

public class Calculator {

	public static void main(String[] args) 
	{
		//Calling static methods from different class
		
		MulDivide.Multiplication(12, 10);
		MulDivide.addition(321, 123);
		
		//Calling Non-static methods from different class
		
		MulDivide m = new MulDivide();
		m.substraction(300, 200);
		m.Division(100, 50);
		
		//Calling Multilevel inheritance
		
		LCM_GCD.lcm_gcd(6, 15);
		

	}

}
