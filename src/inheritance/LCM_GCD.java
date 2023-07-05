package inheritance;

public class LCM_GCD extends MulDivide
{
	public static void lcm_gcd (int a, int b)
	{
		int l,m,GCD;
		for (int i=1; i<=1000; i++)
		{
			l = i%a;
			m = i%b;
			if(l==0 && m==0)
			{
				System.out.println("LCM of "+a+" and "+b+" is = "+i);
				GCD = a*b/i;
				System.out.println("GCD of "+a+" and "+b+" is = "+GCD);
				break;
			}
				
		}
	}

}
