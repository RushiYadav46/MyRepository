package practice;

public class AmstrongNum {

	public static void main(String[] args) 
	{
		
		int num=153;
		int a;
		int b;
		int c;
		
		if(num>0)
		{
			//Separating the numbers
			a = num%10;
			int temp = num/10;
			b = temp%10;
			c = temp/10;
			
			//equation 
			int ams = ((a*a*a)+(b*b*b)+(c*c*c));
			if(ams==num)
			{
				System.out.println("Its a Amstrong Number");
			}
			else
			{
				System.out.println("Its NOT a Amstrong Number!!");
			}
		}
		else
		{
			System.out.println("Enter Valid Number");
		}
		
		
		
		
			
			
		

	}

}
