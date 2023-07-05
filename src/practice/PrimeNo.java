package practice;

public class PrimeNo {

	public static void main(String[] args) 
	{
		int a=41;
		float b;
		for (int i=2; i<=100;)
		{
			b=a%i;
			if(b==1 && i!=a)
			{
				System.out.println(a+" Is a PRIME number");
				break;
			}
			else
			{
				System.out.println(a+" Is NOT a prime number! ");
				break;
			}
		}

	}

}
