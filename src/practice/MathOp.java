package practice;

public class MathOp {

	public static void main(String[] args)
	{
		MathOp M = new MathOp();
		M.Addition(258, 852);
		System.out.println("-----------------------------");
		M.Substract(654, 456);
		System.out.println("-----------------------------");
		M.Multiply(789, 987);
		System.out.println("-----------------------------");

	}
	
	public void Addition(int A, int B)
	{
		int add;
		add = A + B;
		System.out.println("Addition is = "+add);
	}
	
	public void Substract(int A, int B)
	{
		int sub;
		sub = A - B;
		System.out.println("Subtraction is = "+sub);
	}
	
	public void Multiply(int A, int B)
	{
		int Mul;
		Mul = A*B;
		System.out.println("Multiplication is = "+Mul);
	}

}
