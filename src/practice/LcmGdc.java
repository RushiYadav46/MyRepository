package practice;

public class LcmGdc {

	public static void main(String[] args) 
	{
		int a=72;
		int b=120;
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
