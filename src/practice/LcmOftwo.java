package practice;

public class LcmOftwo {

	public static void main(String[] args) 
	{
		int a=3;
		int b=63;
		int l;
		for(int i=b+1; i<=1000; i++)
		{
			l = i%b;
			if(l==0)
			{
			 	while(i%a==0)
					break;
				{
					System.out.println("LCM is "+i);
					break;
				}
				
			}
		}
		
		
		

	}}
