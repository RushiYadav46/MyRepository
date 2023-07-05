package inheritance;

public class MulDivide extends AddSubMath 
{
	public static void Multiplication(int a, int b)
	{
		int mul = a*b;
		System.out.println("Multiplication is = "+mul);
	}
	
	public void Division(int c, int d)
	{
		int div= c/d;
		System.out.println("Division is = "+div);
	}

}
