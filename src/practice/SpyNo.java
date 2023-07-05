package practice;

public class SpyNo {

	public static void main(String[] args) 
	{
		int num=132;
		int a;
		int add=0;
		int mul=1;
		
		while(num>0)
		{
			a=num%10;
			add=add+a;
			
			mul=mul*a;
			num=num/10;
		}
		
		if(mul==add)
		{
			System.out.println("Its a SPY number! ");
		}
		else {
			System.out.println("Its NOT a spy number ");
		}

	}

}
